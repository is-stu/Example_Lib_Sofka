package tewar.demo.usecase.reserva;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tewar.demo.domain.reserva.Reserve;
import tewar.demo.domain.reserva.command.CreateReserve;

public class CreateReserveUseCase extends UseCase<RequestCommand<CreateReserve>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateReserve> createReserveRequestCommand) {

        var command = createReserveRequestCommand.getCommand();
        var reserve = new Reserve(command.getReserveId(),
                command.getEstadoReserva(),
                command.getDuracionPrestamo(),
                command.getFechaPrestamo());

        emit().onResponse(new ResponseEvents(reserve.getUncommittedChanges()));

    }
}
