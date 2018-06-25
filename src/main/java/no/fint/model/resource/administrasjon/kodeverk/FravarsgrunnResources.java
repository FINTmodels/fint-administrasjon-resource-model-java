// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FravarsgrunnResources extends AbstractCollectionResources<FravarsgrunnResource> {

    @Override
    public TypeReference<List<FravarsgrunnResource>> getTypeReference() {
        return new TypeReference<List<FravarsgrunnResource>>() {};
    }
}
