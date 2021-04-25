package tewar.demo.domain.recurso;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import tewar.demo.domain.recurso.entities.Category;
import tewar.demo.domain.recurso.events.ResourceCreated;
import tewar.demo.domain.recurso.values.*;

public class Resource extends AggregateEvent<ResourceId> {

    protected Category category;
    protected ResourceName resourceName;
    protected Description description;
    protected BarCode barCode;
    protected State state;

    public Resource(ResourceId entityId, Category category, ResourceName resourceName, Description description, BarCode barCode, State state) {
        super(entityId);
        appendChange(new ResourceCreated(category, resourceName, description, barCode, state)).apply();
    }

    private Resource(ResourceId entityId) {
        super(entityId);
        subscribe(new ResourceEventChange(this));

    }
}
