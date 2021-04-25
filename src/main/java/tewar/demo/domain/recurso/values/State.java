package tewar.demo.domain.recurso.values;

import co.com.sofka.domain.generic.ValueObject;

public class State implements ValueObject<Boolean> {
    private final boolean state;

    public State(boolean state) {
        this.state = state;
    }

    @Override
    public Boolean value() {
        return state;
    }
}
