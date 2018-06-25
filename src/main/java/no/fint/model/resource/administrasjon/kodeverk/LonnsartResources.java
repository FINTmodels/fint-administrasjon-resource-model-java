// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class LonnsartResources extends AbstractCollectionResources<LonnsartResource> {

    @Override
    public TypeReference<List<LonnsartResource>> getTypeReference() {
        return new TypeReference<List<LonnsartResource>>() {};
    }
}
