// Built from tag v2.7.0

package no.fint.model.resource.administrasjon.personal;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class PersonalressursResources extends AbstractCollectionResources<PersonalressursResource> {

    @Override
    public TypeReference<List<PersonalressursResource>> getTypeReference() {
        return new TypeReference<List<PersonalressursResource>>() {};
    }
}
