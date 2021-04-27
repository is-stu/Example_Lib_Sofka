package tewar.demo.usecase.recurso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tewar.demo.domain.recurso.command.UpdateResource;
import tewar.demo.domain.recurso.entities.Category;
import tewar.demo.domain.recurso.events.ResourceCreated;
import tewar.demo.domain.recurso.events.UpdatedResource;
import tewar.demo.domain.recurso.values.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UpdateResourceUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void updateResource() {
        var id = ResourceId.of("xx");
        var category = new Category(new CategoryId("01"), "Laptop");
        var resourceName = new ResourceName("HP pro book");
        var description = new Description("Just a laptop");
        var state = new State(true);

        var command = new UpdateResource(id, category, resourceName, description, state);

        var useCase = new UpdateResourceUseCase();
        useCase.addRepository(repository);
        Mockito.when(repository.getEventsBy(Mockito.any())).thenReturn(events());

        //Todo aplicar commando aplicando el handler

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        Mockito.verify(repository).getEventsBy(Mockito.any());

        UpdatedResource updatedResource = (UpdatedResource) events.get(0);

        assertEquals("HP pro book",updatedResource.getResourceName().value());
        assertEquals("Just a laptop",updatedResource.getDescription().value());
        assertEquals(true,updatedResource.getState().value());

    }

    private List<DomainEvent> events() {
        return List.of(new ResourceCreated(new Category(new CategoryId("111"), "Laptop"),
                new ResourceName("xxx"),
                new Description("xxx"),
                new BarCode(123),
                new State(true)));
    }

}