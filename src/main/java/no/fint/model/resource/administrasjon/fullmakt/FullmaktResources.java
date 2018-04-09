// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.fullmakt;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FullmaktResources extends AbstractCollectionResources<FullmaktResource> {

    @Override
    public TypeReference<List<FullmaktResource>> getTypeReference() {
        return new TypeReference<List<FullmaktResource>>() {};
    }
}
