package tewar.demo.usecase.solicitante;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tewar.demo.domain.solicitante.Applicant;
import tewar.demo.domain.solicitante.command.CreateApplicant;

public class CreateApplicantUseCase extends UseCase<RequestCommand<CreateApplicant>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateApplicant> createApplicantRequestCommand) {
        var command = createApplicantRequestCommand.getCommand();
        var applicant = new Applicant(command.getApplicantId(),
                command.getPerson(),
                command.getFine(),
                command.getReserveID());

        emit().onSuccess(new ResponseEvents(applicant.getUncommittedChanges()));
    }
}
