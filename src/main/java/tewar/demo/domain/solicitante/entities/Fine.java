package tewar.demo.domain.solicitante.entities;

import co.com.sofka.domain.generic.Entity;

public class Fine extends Entity<> {

    private final Integer id;
    private final Reason reason;
    private final BeginDate beginDate;
    private final EndDate endDate;


    public Fine(FineID entityId, Integer id, Reason reason, BeginDate beginDate, EndDate endDate) {
        super(entityId);
        this.id = id;
        this.reason = reason;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
}
