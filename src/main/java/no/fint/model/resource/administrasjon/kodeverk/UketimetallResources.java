// Built from tag v3.0.0

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class UketimetallResources extends AbstractCollectionResources<UketimetallResource> {

    public UketimetallResources(Collection<UketimetallResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<UketimetallResource>> getTypeReference() {
        return new TypeReference<List<UketimetallResource>>() {};
    }
}