package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class EndDate implements ValueObject<LocalDate> {

    private final LocalDate date;

    public EndDate(LocalDate date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public LocalDate value() {
        return date;
    }
}
