// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FakturagrunnlagResources extends AbstractCollectionResources<FakturagrunnlagResource> {

    @Override
    public TypeReference<List<FakturagrunnlagResource>> getTypeReference() {
        return new TypeReference<List<FakturagrunnlagResource>>() {};
    }
}
