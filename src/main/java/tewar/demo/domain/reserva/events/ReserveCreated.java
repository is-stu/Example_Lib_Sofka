package tewar.demo.domain.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import tewar.demo.domain.reserva.entities.EstadoReserva;
import tewar.demo.domain.reserva.values.DuracionPrestamo;
import tewar.demo.domain.reserva.values.FechaPrestamo;

public class ReserveCreated extends DomainEvent {


    private final EstadoReserva estadoReserva;
    private final DuracionPrestamo duracionPrestamo;
    private final FechaPrestamo fechaPrestamo;

    public ReserveCreated(EstadoReserva estadoReserva, DuracionPrestamo duracionPrestamo, FechaPrestamo fechaPrestamo) {
        super("reserve.reserve.createReserve");
        this.estadoReserva = estadoReserva;
        this.duracionPrestamo = duracionPrestamo;
        this.fechaPrestamo = fechaPrestamo;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public DuracionPrestamo getDuracionPrestamo() {
        return duracionPrestamo;
    }

    public FechaPrestamo getFechaPrestamo() {
        return fechaPrestamo;
    }
}
