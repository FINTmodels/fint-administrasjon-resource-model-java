// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class AnsvarResources extends AbstractCollectionResources<AnsvarResource> {

    @Override
    public TypeReference<List<AnsvarResource>> getTypeReference() {
        return new TypeReference<List<AnsvarResource>>() {};
    }
}