// Built from tag v2.7.0

package no.fint.model.resource.administrasjon.personal;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FravarResources extends AbstractCollectionResources<FravarResource> {

    @Override
    public TypeReference<List<FravarResource>> getTypeReference() {
        return new TypeReference<List<FravarResource>>() {};
    }
}
