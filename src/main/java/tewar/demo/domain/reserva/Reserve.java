package tewar.demo.domain.reserva;

import co.com.sofka.domain.generic.AggregateEvent;
import tewar.demo.domain.solicitante.values.ReserveID;
import tewar.demo.domain.reserva.entities.EstadoReserva;
import tewar.demo.domain.reserva.events.ReserveCreated;
import tewar.demo.domain.reserva.values.DuracionPrestamo;
import tewar.demo.domain.reserva.values.FechaPrestamo;

public class Reserve extends AggregateEvent<ReserveID> {

    protected EstadoReserva estadoReserva;
    protected DuracionPrestamo duracionPrestamo;
    protected FechaPrestamo fechaPrestamo;

    public Reserve(ReserveID entityId, EstadoReserva estadoReserva, DuracionPrestamo duracionPrestamo, FechaPrestamo fechaPrestamo) {
        super(entityId);
        appendChange(new ReserveCreated(estadoReserva,duracionPrestamo,fechaPrestamo)).apply();
    }

    private Reserve(ReserveID entityId) {
        super(entityId);
        subscribe(new ReserveEventChange(this));
    }
}
