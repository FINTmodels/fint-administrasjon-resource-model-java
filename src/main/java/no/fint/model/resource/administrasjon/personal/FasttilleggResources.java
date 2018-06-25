// Built from tag v3.0.0

package no.fint.model.resource.administrasjon.personal;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FasttilleggResources extends AbstractCollectionResources<FasttilleggResource> {

    @Override
    public TypeReference<List<FasttilleggResource>> getTypeReference() {
        return new TypeReference<List<FasttilleggResource>>() {};
    }
}
