// Built from tag v3.0.0

package no.fint.model.resource.administrasjon.fullmakt;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class RolleResources extends AbstractCollectionResources<RolleResource> {

    @Override
    public TypeReference<List<RolleResource>> getTypeReference() {
        return new TypeReference<List<RolleResource>>() {};
    }
}
