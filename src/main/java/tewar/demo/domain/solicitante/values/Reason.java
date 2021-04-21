package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Reason implements ValueObject<String> {

    private final String reason;

    public Reason(String reason) {
        this.reason = Objects.requireNonNull(reason);
        if (reason.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede esta vacio");
        }
    }

    @Override
    public String value() {
        return reason;
    }
}
