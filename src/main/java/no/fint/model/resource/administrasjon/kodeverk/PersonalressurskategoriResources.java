// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class PersonalressurskategoriResources extends AbstractCollectionResources<PersonalressurskategoriResource> {

    @Override
    public TypeReference<List<PersonalressurskategoriResource>> getTypeReference() {
        return new TypeReference<List<PersonalressurskategoriResource>>() {};
    }
}
