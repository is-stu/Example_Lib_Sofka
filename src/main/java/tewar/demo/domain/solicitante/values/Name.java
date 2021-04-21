package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    private final String name;

    public Name(String name) {
        this.name = Objects.requireNonNull(name);
        if (name.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede esta vacio");
        }
    }

    @Override
    public String value() {
        return name;
    }
}
