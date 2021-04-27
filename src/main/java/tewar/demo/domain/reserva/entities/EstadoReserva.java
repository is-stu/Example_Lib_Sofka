package tewar.demo.domain.reserva.entities;

import co.com.sofka.domain.generic.Entity;
import tewar.demo.domain.reserva.values.EstadoReservaId;

public class EstadoReserva extends Entity<EstadoReservaId> {

    private final String description;

    public EstadoReserva(EstadoReservaId entityId, String description) {
        super(entityId);

        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
