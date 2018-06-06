// Built from tag v3.0.0-rc-1

package no.fint.model.resource.administrasjon.organisasjon;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class OrganisasjonselementResources extends AbstractCollectionResources<OrganisasjonselementResource> {

    @Override
    public TypeReference<List<OrganisasjonselementResource>> getTypeReference() {
        return new TypeReference<List<OrganisasjonselementResource>>() {};
    }
}
