// Built from tag v2.7.0

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class StillingskodeResources extends AbstractCollectionResources<StillingskodeResource> {

    @Override
    public TypeReference<List<StillingskodeResource>> getTypeReference() {
        return new TypeReference<List<StillingskodeResource>>() {};
    }
}
