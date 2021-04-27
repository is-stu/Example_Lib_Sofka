package tewar.demo.domain.solicitante.command;

import co.com.sofka.domain.generic.Command;
import tewar.demo.domain.solicitante.entities.Fine;
import tewar.demo.domain.solicitante.entities.Person;
import tewar.demo.domain.solicitante.values.ApplicantId;
import tewar.demo.domain.solicitante.values.ReserveID;

public class CreateApplicant implements Command {

    private final ApplicantId applicantId;
    private final Person person;
    private final Fine fine;
    private final ReserveID reserveID;

    public CreateApplicant(ApplicantId entityId, Person person, Fine fine, ReserveID reserveID) {
        applicantId = entityId;
        this.person = person;
        this.fine = fine;
        this.reserveID = reserveID;
    }

    public ApplicantId getApplicantId() {
        return applicantId;
    }

    public Person getPerson() {
        return person;
    }

    public Fine getFine() {
        return fine;
    }

    public ReserveID getReserveID() {
        return reserveID;
    }
}
