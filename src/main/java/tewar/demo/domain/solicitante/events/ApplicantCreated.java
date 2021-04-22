package tewar.demo.domain.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import tewar.demo.domain.solicitante.entities.Fine;
import tewar.demo.domain.solicitante.entities.Person;
import tewar.demo.domain.solicitante.values.ReserveID;

public class ApplicantCreated extends DomainEvent {
    private final Person person;
    private final Fine fine;
    private final ReserveID reserveID;

    public ApplicantCreated(Person person, Fine fine, ReserveID reserveID) {
        super("applicant.applicant.createApplicant");
        this.person = person;
        this.fine = fine;
        this.reserveID = reserveID;
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
