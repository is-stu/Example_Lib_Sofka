package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class BeginDate implements ValueObject<Date> {

    private final Date date;

    public BeginDate(Date date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public Date value() {
        return date;
    }
}
