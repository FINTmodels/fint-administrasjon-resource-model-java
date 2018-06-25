// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FravarstypeResources extends AbstractCollectionResources<FravarstypeResource> {

    @Override
    public TypeReference<List<FravarstypeResource>> getTypeReference() {
        return new TypeReference<List<FravarstypeResource>>() {};
    }
}
