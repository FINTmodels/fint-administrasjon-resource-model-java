// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class VarelinjeResources extends AbstractCollectionResources<VarelinjeResource> {

    public VarelinjeResources(Collection<VarelinjeResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<VarelinjeResource>> getTypeReference() {
        return new TypeReference<List<VarelinjeResource>>() {};
    }
}
