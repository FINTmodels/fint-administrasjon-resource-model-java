// Built from tag v3.4.0-rc-1

package no.fint.model.resource.administrasjon.kodeverk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class LopenummerResources extends AbstractCollectionResources<LopenummerResource> {

    public LopenummerResources(Collection<LopenummerResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<LopenummerResource>> getTypeReference() {
        return new TypeReference<List<LopenummerResource>>() {};
    }
}
