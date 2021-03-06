// Built from tag v3.5.0

package no.fint.model.resource.administrasjon.fullmakt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class RolleResources extends AbstractCollectionResources<RolleResource> {

    public RolleResources(Collection<RolleResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<RolleResource>> getTypeReference() {
        return new TypeReference<List<RolleResource>>() {};
    }
}
