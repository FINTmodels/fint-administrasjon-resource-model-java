// Built from tag v3.0.0-rc-1

package no.fint.model.resource.administrasjon.personal;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class ArbeidsforholdResources extends AbstractCollectionResources<ArbeidsforholdResource> {

    @Override
    public TypeReference<List<ArbeidsforholdResource>> getTypeReference() {
        return new TypeReference<List<ArbeidsforholdResource>>() {};
    }
}
