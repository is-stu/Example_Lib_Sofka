package tewar.demo.domain.reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class DuracionPrestamo implements ValueObject<LocalDate> {

    private final LocalDate date;

    public DuracionPrestamo(LocalDate date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public LocalDate value() {
        return date;
    }
}
