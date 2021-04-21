package tewar.demo.domain.solicitante.entities;

import co.com.sofka.domain.generic.Entity;
import tewar.demo.domain.solicitante.values.BeginDate;
import tewar.demo.domain.solicitante.values.EndDate;
import tewar.demo.domain.solicitante.values.FineId;
import tewar.demo.domain.solicitante.values.Reason;

public class Fine extends Entity<FineId> {

    private final FineId fineId;
    private final Reason reason;
    private final BeginDate beginDate;
    private final EndDate endDate;


    public Fine(FineId entityId, FineId fineId, Reason reason, BeginDate beginDate, EndDate endDate) {
        super(entityId);
        this.fineId = fineId;
        this.reason = reason;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Reason getReason() {
        return reason;
    }

    public BeginDate getBeginDate() {
        return beginDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
