// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.personal;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FastlonnResources extends AbstractCollectionResources<FastlonnResource> {

    @Override
    public TypeReference<List<FastlonnResource>> getTypeReference() {
        return new TypeReference<List<FastlonnResource>>() {};
    }
}
