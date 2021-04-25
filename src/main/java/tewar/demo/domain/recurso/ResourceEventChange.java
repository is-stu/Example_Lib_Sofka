package tewar.demo.domain.recurso;

import co.com.sofka.domain.generic.EventChange;
import tewar.demo.domain.recurso.events.ResourceCreated;

public class ResourceEventChange extends EventChange {
    public ResourceEventChange(Resource resource) {
        apply((ResourceCreated event)->{
            resource.resourceName = event.getResourceName();
            resource.barCode = event.getBarCode();
            resource.category = event.getCategory();
            resource.description = event.getDescription();
            resource.state = event.getState();
        });
    }
}
