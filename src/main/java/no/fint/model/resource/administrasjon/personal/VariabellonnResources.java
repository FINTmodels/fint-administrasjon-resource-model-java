// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.personal;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class VariabellonnResources extends AbstractCollectionResources<VariabellonnResource> {

    @Override
    public TypeReference<List<VariabellonnResource>> getTypeReference() {
        return new TypeReference<List<VariabellonnResource>>() {};
    }
}
