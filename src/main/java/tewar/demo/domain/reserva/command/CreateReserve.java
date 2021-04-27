package tewar.demo.domain.reserva.command;

import co.com.sofka.domain.generic.Command;
import tewar.demo.domain.reserva.entities.EstadoReserva;
import tewar.demo.domain.reserva.values.DuracionPrestamo;
import tewar.demo.domain.reserva.values.FechaPrestamo;
import tewar.demo.domain.solicitante.values.ReserveID;

public class CreateReserve implements Command {

    private final ReserveID reserveId;
    private final EstadoReserva estadoReserva;
    private final DuracionPrestamo duracionPrestamo;
    private final FechaPrestamo fechaPrestamo;

    public CreateReserve(ReserveID entityId, EstadoReserva estadoReserva, DuracionPrestamo duracionPrestamo, FechaPrestamo fechaPrestamo) {
        reserveId = entityId;
        this.estadoReserva = estadoReserva;
        this.duracionPrestamo = duracionPrestamo;
        this.fechaPrestamo = fechaPrestamo;
    }

    public ReserveID getReserveId() {
        return reserveId;
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
