package tewar.demo.domain.solicitante;

import co.com.sofka.domain.generic.EventChange;
import tewar.demo.domain.solicitante.events.ApplicantCreated;

public class ApplicantEventChange extends EventChange {
    public ApplicantEventChange(Applicant applicant) {
        apply((ApplicantCreated event) -> {
            applicant.fine = event.getFine();
            applicant.person = event.getPerson();
            applicant.reserveID = event.getReserveID();
        });
    }
}
