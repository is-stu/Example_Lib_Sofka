package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class PersonId extends Identity {

    private final Integer id;


    public PersonId(String uuid, Integer id) {
        super(uuid);
        this.id = Objects.requireNonNull(id);
    }

}
