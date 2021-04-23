package tewar.demo.domain.reserva;

import co.com.sofka.domain.generic.EventChange;
import tewar.demo.domain.reserva.events.ReserveCreated;

public class ReserveEventChange extends EventChange {
    public ReserveEventChange(Reserve reserve) {
        apply((ReserveCreated event)->{
            reserve.estadoReserva = event.getEstadoReserva();
            reserve.duracionPrestamo = event.getDuracionPrestamo();
            reserve.fechaPrestamo = event.getFechaPrestamo();
        });
    }
}
