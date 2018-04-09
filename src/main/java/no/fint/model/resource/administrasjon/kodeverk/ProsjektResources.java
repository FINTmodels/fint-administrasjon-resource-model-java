// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class ProsjektResources extends AbstractCollectionResources<ProsjektResource> {

    @Override
    public TypeReference<List<ProsjektResource>> getTypeReference() {
        return new TypeReference<List<ProsjektResource>>() {};
    }
}
