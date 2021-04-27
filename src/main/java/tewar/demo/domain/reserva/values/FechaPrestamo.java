package tewar.demo.domain.reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class FechaPrestamo implements ValueObject<LocalDate> {

    private final LocalDate date;

    public FechaPrestamo(LocalDate date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public LocalDate value() {
        return date;
    }

}
