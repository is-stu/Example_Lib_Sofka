package tewar.demo.reserva.entities;

import co.com.sofka.domain.generic.Entity;
import tewar.demo.reserva.values.EstadoReservaId;

public class EstadoReserva extends Entity<EstadoReservaId> {

    private final Integer id;
    private final String description;

    public EstadoReserva(EstadoReservaId entityId, Integer id, String description) {
        super(entityId);
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
