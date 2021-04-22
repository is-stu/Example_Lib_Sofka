package tewar.demo.reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class DuracionPrestamo implements ValueObject<Date> {

    private final Date date;

    public DuracionPrestamo(Date date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public Date value() {
        return date;
    }
}
