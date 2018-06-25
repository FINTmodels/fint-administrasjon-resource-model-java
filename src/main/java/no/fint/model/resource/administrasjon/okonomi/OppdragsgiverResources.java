// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class OppdragsgiverResources extends AbstractCollectionResources<OppdragsgiverResource> {

    @Override
    public TypeReference<List<OppdragsgiverResource>> getTypeReference() {
        return new TypeReference<List<OppdragsgiverResource>>() {};
    }
}
