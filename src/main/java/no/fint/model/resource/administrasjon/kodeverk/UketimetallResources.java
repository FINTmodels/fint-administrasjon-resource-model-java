// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class UketimetallResources extends AbstractCollectionResources<UketimetallResource> {

    @Override
    public TypeReference<List<UketimetallResource>> getTypeReference() {
        return new TypeReference<List<UketimetallResource>>() {};
    }
}
