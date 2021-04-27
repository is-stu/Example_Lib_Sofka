package tewar.demo.domain.recurso.events;

import co.com.sofka.domain.generic.DomainEvent;
import tewar.demo.domain.recurso.entities.Category;
import tewar.demo.domain.recurso.values.Description;
import tewar.demo.domain.recurso.values.ResourceId;
import tewar.demo.domain.recurso.values.ResourceName;
import tewar.demo.domain.recurso.values.State;

public class UpdatedResource extends DomainEvent {

    private final Category category;
    private final ResourceName resourceName;
    private final Description description;
    private final State state;

    public UpdatedResource( Category category, ResourceName resourceName, Description description, State state) {
        super("update.resource.updateResource");
        this.category = category;
        this.resourceName = resourceName;
        this.description = description;
        this.state = state;
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
