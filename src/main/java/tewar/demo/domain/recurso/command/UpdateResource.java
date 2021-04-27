package tewar.demo.domain.recurso.command;

import co.com.sofka.domain.generic.Command;
import tewar.demo.domain.recurso.entities.Category;
import tewar.demo.domain.recurso.values.*;

public class UpdateResource implements Command {

    private final ResourceId resourceId;
    private final Category category;
    private final ResourceName resourceName;
    private final Description description;
    private final State state;

    public UpdateResource(ResourceId entityId, Category category, ResourceName resourceName, Description description, State state) {
        resourceId = entityId;
        this.category = category;
        this.resourceName = resourceName;
        this.description = description;
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

    public State getState() {
        return state;
    }
}
