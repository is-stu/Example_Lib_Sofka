package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class PersonId extends Identity {

    public PersonId(String uuid) {
        super(uuid);
    }

    public static PersonId of(String uuid) {
        return new PersonId(uuid);
    }

}
