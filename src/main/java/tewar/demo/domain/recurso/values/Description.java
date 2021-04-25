package tewar.demo.domain.recurso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject<String> {
    private final String description;

    public Description(String description) {
        this.description = Objects.requireNonNull(description);
        if(description.isBlank()){
            throw new IllegalArgumentException("La descripcion no puede esta vacio");
        }
    }

    @Override
    public String value() {
        return description;
    }
}
