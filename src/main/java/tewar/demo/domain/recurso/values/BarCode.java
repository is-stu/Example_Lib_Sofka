package tewar.demo.domain.recurso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BarCode implements ValueObject<Integer> {
    private final Integer code;

    public BarCode(Integer code) {
        this.code = Objects.requireNonNull(code);
    }

    @Override
    public Integer value() {
        return code;
    }
}
