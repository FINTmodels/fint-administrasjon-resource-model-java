// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.personal;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class LonnResources extends AbstractCollectionResources<LonnResource> {

    @Override
    public TypeReference<List<LonnResource>> getTypeReference() {
        return new TypeReference<List<LonnResource>>() {};
    }
}
