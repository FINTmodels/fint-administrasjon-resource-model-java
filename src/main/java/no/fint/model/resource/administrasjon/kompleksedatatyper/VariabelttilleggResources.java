// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.kompleksedatatyper;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class VariabelttilleggResources extends AbstractCollectionResources<VariabelttilleggResource> {

    @Override
    public TypeReference<List<VariabelttilleggResource>> getTypeReference() {
        return new TypeReference<List<VariabelttilleggResource>>() {};
    }
}
