package tewar.demo.domain.recurso.values;

import co.com.sofka.domain.generic.Identity;

public class ResourceId extends Identity {

    private ResourceId(String uuid) {
        super(uuid);
    }

    public ResourceId() {
    }

    public static ResourceId of(String uuid) {
        return new ResourceId(uuid);
    }

}
