package tewar.demo.reserva;

import co.com.sofka.domain.generic.AggregateEvent;
import tewar.demo.domain.solicitante.values.ReserveID;
import tewar.demo.reserva.entities.EstadoReserva;
import tewar.demo.reserva.events.ReserveCreated;
import tewar.demo.reserva.values.DuracionPrestamo;
import tewar.demo.reserva.values.FechaPrestamo;

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
