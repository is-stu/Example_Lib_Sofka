package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Age implements ValueObject<Integer> {

    private final Integer age;

    public Age(Integer age) {
        this.age = Objects.requireNonNull(age);
    }

    @Override
    public Integer value() {
        return age;
    }
}
