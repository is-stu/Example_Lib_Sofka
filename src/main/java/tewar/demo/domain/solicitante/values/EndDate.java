package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class EndDate implements ValueObject<Date> {

    private final Date date;

    public EndDate(Date date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public Date value() {
        return date;
    }
}
