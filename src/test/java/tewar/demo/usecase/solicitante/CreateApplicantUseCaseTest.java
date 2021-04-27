package tewar.demo.usecase.solicitante;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Test;
import tewar.demo.domain.solicitante.command.CreateApplicant;
import tewar.demo.domain.solicitante.entities.Fine;
import tewar.demo.domain.solicitante.entities.Person;
import tewar.demo.domain.solicitante.events.ApplicantCreated;
import tewar.demo.domain.solicitante.values.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateApplicantUseCaseTest {

    @Test
    public void createNewApplicant(){

        var applicantId = new ApplicantId("123");
        var person = new Person(new PersonId("0123"),new DocumentType("CC"),new Name("Stewar"),new Age(21));
        var fine = new Fine(new FineId("000"),new Reason("NA"),new BeginDate(LocalDate.of(2020,01,01)),new EndDate(LocalDate.of(2020,02,01)));
        var reserve = new ReserveID("1");

        var command = new CreateApplicant(applicantId,person,fine,reserve);

        var useCase = new CreateApplicantUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command)).orElseThrow().getDomainEvents();

        ApplicantCreated applicantCreated = (ApplicantCreated) events.get(0);

        assertEquals("Stewar", applicantCreated.getPerson().getName().value());
        assertEquals("NA", applicantCreated.getFine().getReason().value());
        assertEquals("1", applicantCreated.getReserveID().value());


    }

}