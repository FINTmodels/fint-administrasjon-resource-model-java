// Built from tag v3.0.0-rc-1

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
