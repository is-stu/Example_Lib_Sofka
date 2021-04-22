package tewar.demo.reserva;

import co.com.sofka.domain.generic.EventChange;
import tewar.demo.reserva.events.ReserveCreated;

public class ReserveEventChange extends EventChange {
    public ReserveEventChange(Reserve reserve) {
        apply((ReserveCreated event)->{
            reserve.estadoReserva = event.getEstadoReserva();
            reserve.duracionPrestamo = event.getDuracionPrestamo();
            reserve.fechaPrestamo = event.getFechaPrestamo();
        });
    }
}
