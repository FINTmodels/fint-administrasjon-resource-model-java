// Built from tag v2.8.0

package no.fint.model.resource.administrasjon.kompleksedatatyper;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class BeskjeftigelseResources extends AbstractCollectionResources<BeskjeftigelseResource> {

    @Override
    public TypeReference<List<BeskjeftigelseResource>> getTypeReference() {
        return new TypeReference<List<BeskjeftigelseResource>>() {};
    }
}
