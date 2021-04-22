package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.Identity;

public class ReserveID extends Identity {

    public ReserveID(String uuid) {
        super(uuid);
    }

    public static ReserveID of(String uuid) {
        return new ReserveID(uuid);
    }
}
