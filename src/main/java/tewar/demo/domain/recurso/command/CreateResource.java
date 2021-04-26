package tewar.demo.domain.recurso.command;

import co.com.sofka.domain.generic.Command;
import tewar.demo.domain.recurso.entities.Category;
import tewar.demo.domain.recurso.values.*;

public class CreateResource implements Command {

    private final ResourceId resourceId;
    private final Category category;
    private final ResourceName resourceName;
    private final Description description;
    private final BarCode barCode;
    private final State state;

    public CreateResource(ResourceId entityId, Category category, ResourceName resourceName, Description description, BarCode barCode, State state) {
        resourceId = entityId;
        this.category = category;
        this.resourceName = resourceName;
        this.description = description;
        this.barCode = barCode;
        this.state = state;
    }

    public ResourceId getResourceId() {
        return resourceId;
    }

    public Category getCategory() {
        return category;
    }

    public ResourceName getResourceName() {
        return resourceName;
    }

    public Description getDescription() {
        return description;
    }

    public BarCode getBarCode() {
        return barCode;
    }

    public State getState() {
        return state;
    }
}
