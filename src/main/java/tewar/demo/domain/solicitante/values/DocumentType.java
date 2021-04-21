package tewar.demo.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DocumentType implements ValueObject<String> {

    private final String document;

    public DocumentType(String document) {
        this.document = Objects.requireNonNull(document);
        if(document.isBlank()){
            throw new IllegalArgumentException("El tipo de documento no puede esta vacio");
        }
    }

    public String value() {
        return document;
    }
}
