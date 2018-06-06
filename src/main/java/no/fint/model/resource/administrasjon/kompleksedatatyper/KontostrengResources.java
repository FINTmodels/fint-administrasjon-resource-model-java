// Built from tag v3.0.0-rc-1

package no.fint.model.resource.administrasjon.kompleksedatatyper;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class KontostrengResources extends AbstractCollectionResources<KontostrengResource> {

    @Override
    public TypeReference<List<KontostrengResource>> getTypeReference() {
        return new TypeReference<List<KontostrengResource>>() {};
    }
}
