// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class MvakodeResources extends AbstractCollectionResources<MvakodeResource> {

    public MvakodeResources(Collection<MvakodeResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<MvakodeResource>> getTypeReference() {
        return new TypeReference<List<MvakodeResource>>() {};
    }
}
