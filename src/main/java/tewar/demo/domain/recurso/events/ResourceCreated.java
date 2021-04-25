package tewar.demo.domain.recurso.events;

import co.com.sofka.domain.generic.DomainEvent;
import tewar.demo.domain.recurso.entities.Category;
import tewar.demo.domain.recurso.values.BarCode;
import tewar.demo.domain.recurso.values.Description;
import tewar.demo.domain.recurso.values.ResourceName;
import tewar.demo.domain.recurso.values.State;

public class ResourceCreated extends DomainEvent {
    private final Category category;
    private final ResourceName resourceName;
    private final Description description;
    private final BarCode barCode;
    private final State state;

    public ResourceCreated(Category category, ResourceName resourceName, Description description, BarCode barCode, State state) {
        super("reserve.resource.createResource");
        this.category = category;
        this.resourceName = resourceName;
        this.description = description;
        this.barCode = barCode;
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

    public BarCode getBarCode() {
        return barCode;
    }

    public State getState() {
        return state;
    }
}
