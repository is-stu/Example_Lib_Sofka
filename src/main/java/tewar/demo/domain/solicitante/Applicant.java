package tewar.demo.domain.solicitante;

import co.com.sofka.domain.generic.AggregateEvent;
import tewar.demo.domain.solicitante.entities.Fine;
import tewar.demo.domain.solicitante.entities.Person;
import tewar.demo.domain.solicitante.events.ApplicantCreated;
import tewar.demo.domain.solicitante.values.ApplicantId;
import tewar.demo.domain.solicitante.values.ReserveID;

public class Applicant extends AggregateEvent<ApplicantId> {

    protected Person person;
    protected Fine fine;
    protected ReserveID reserveID;

    public Applicant(ApplicantId entityId, Person person, Fine fine, ReserveID reserveID) {
        super(entityId);
        appendChange(new ApplicantCreated(person, fine, reserveID)).apply();
    }

    private Applicant(ApplicantId entityId) {
        super(entityId);
        subscribe(new ApplicantEventChange(this));
    }


}
