package tewar.demo.usecase.recurso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tewar.demo.domain.recurso.command.CreateResource;
import tewar.demo.domain.recurso.entities.Category;
import tewar.demo.domain.recurso.events.ResourceCreated;
import tewar.demo.domain.recurso.values.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateResourceUseCaseTest {

    @Test
    public void createNewResource() {

        var id = ResourceId.of("111");
        var category = new Category(new CategoryId("123"), "Laptop");
        var resourceName = new ResourceName("Hp pro book");
        var description = new Description("Just a laptop");
        var barcode = new BarCode(999);
        var state = new State(true);

        var command = new CreateResource(id, category, resourceName, description, barcode, state);

        var useCase = new CreateResourceUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command)).
                        orElseThrow().
                        getDomainEvents();


        ResourceCreated resourceCreated = (ResourceCreated) events.get(0);

        assertEquals("Hp pro book",resourceCreated.getResourceName().value());
        assertEquals("Laptop",resourceCreated.getCategory().getCategoryName());
        assertEquals("Just a laptop",resourceCreated.getDescription().value());
        assertEquals(999,resourceCreated.getBarCode().value());
        assertEquals(true,resourceCreated.getState().value());

    }

}