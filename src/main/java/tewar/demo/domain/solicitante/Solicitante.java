package tewar.demo.domain.solicitante;

import co.com.sofka.domain.generic.AggregateEvent;
import tewar.demo.domain.solicitante.entities.Fine;
import tewar.demo.domain.solicitante.entities.Person;
import tewar.demo.domain.solicitante.entities.ReserveID;

public class Solicitante extends AggregateEvent<SolicitanteId>{

    protected Person person;
    protected Fine fine;
    protected ReserveID reserveID;

    public Solicitante(SolicitanteId entityId) {
        super(entityId);
    }
}
