// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class MvakodeResources extends AbstractCollectionResources<MvakodeResource> {

    @Override
    public TypeReference<List<MvakodeResource>> getTypeReference() {
        return new TypeReference<List<MvakodeResource>>() {};
    }
}
