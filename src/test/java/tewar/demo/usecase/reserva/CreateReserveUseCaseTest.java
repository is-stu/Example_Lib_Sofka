package tewar.demo.usecase.reserva;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Test;
import tewar.demo.domain.reserva.command.CreateReserve;
import tewar.demo.domain.reserva.entities.EstadoReserva;
import tewar.demo.domain.reserva.events.ReserveCreated;
import tewar.demo.domain.reserva.values.DuracionPrestamo;
import tewar.demo.domain.reserva.values.EstadoReservaId;
import tewar.demo.domain.reserva.values.FechaPrestamo;
import tewar.demo.domain.solicitante.values.ReserveID;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateReserveUseCaseTest {

    @Test
    public void createNewReserve() {

        var id = new ReserveID("123");
        var estado = new EstadoReserva(new EstadoReservaId("1"), "Whatever");
        var duracion = new DuracionPrestamo(LocalDate.of(2021, 03, 01));
        var fechaDePrestamo = new FechaPrestamo(LocalDate.of(2021, 01, 01));

        var command = new CreateReserve(id, estado, duracion, fechaDePrestamo);

        var useCase = new CreateReserveUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command)).orElseThrow().getDomainEvents();

        ReserveCreated reserveCreated = (ReserveCreated) events.get(0);

        assertEquals("Whatever", reserveCreated.getEstadoReserva().getDescription());
        assertEquals(LocalDate.of(2021, 03, 01), reserveCreated.getDuracionPrestamo().value());
        assertEquals(LocalDate.of(2021, 01, 01), reserveCreated.getFechaPrestamo().value());

    }

}