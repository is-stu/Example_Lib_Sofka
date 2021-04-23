package tewar.demo.domain.reserva.values;

import co.com.sofka.domain.generic.Identity;

public class EstadoReservaId extends Identity {

    public EstadoReservaId(String uuid) {
        super(uuid);
    }

    public static EstadoReservaId of(String uuid) {
        return new EstadoReservaId(uuid);
    }
}
