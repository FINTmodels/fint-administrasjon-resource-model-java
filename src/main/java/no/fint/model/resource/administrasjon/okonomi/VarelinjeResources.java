// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class VarelinjeResources extends AbstractCollectionResources<VarelinjeResource> {

    @Override
    public TypeReference<List<VarelinjeResource>> getTypeReference() {
        return new TypeReference<List<VarelinjeResource>>() {};
    }
}
