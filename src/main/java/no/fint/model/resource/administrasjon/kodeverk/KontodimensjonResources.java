// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class KontodimensjonResources extends AbstractCollectionResources<KontodimensjonResource> {

    @Override
    public TypeReference<List<KontodimensjonResource>> getTypeReference() {
        return new TypeReference<List<KontodimensjonResource>>() {};
    }
}
