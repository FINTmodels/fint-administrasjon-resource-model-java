// Built from tag v3.4.0

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class ArbeidsforholdstypeResources extends AbstractCollectionResources<ArbeidsforholdstypeResource> {

    public ArbeidsforholdstypeResources(Collection<ArbeidsforholdstypeResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<ArbeidsforholdstypeResource>> getTypeReference() {
        return new TypeReference<List<ArbeidsforholdstypeResource>>() {};
    }
}
