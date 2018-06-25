// Built from tag v3.0.0

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class ArbeidsforholdstypeResources extends AbstractCollectionResources<ArbeidsforholdstypeResource> {

    @Override
    public TypeReference<List<ArbeidsforholdstypeResource>> getTypeReference() {
        return new TypeReference<List<ArbeidsforholdstypeResource>>() {};
    }
}
