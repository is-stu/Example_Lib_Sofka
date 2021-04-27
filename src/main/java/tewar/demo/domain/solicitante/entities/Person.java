package tewar.demo.domain.solicitante.entities;

import co.com.sofka.domain.generic.Entity;
import tewar.demo.domain.solicitante.values.Age;
import tewar.demo.domain.solicitante.values.DocumentType;
import tewar.demo.domain.solicitante.values.Name;
import tewar.demo.domain.solicitante.values.PersonId;

public class Person extends Entity<PersonId> {

    private final DocumentType documentType;
    private final Name name;
    private final Age age;

    public Person(PersonId entityId, DocumentType documentType, Name name, Age age) {
        super(entityId);
        this.documentType = documentType;
        this.name = name;
        this.age = age;
    }


    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}
