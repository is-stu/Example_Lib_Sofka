package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Objects;

public class BeginDate implements ValueObject<LocalDate> {

    private final LocalDate date;

    public BeginDate(LocalDate date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public LocalDate value() {
        return date;
    }
}
