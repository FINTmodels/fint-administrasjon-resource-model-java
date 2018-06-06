// Built from tag v3.0.0-rc-1

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
