// Built from tag v2.7.0

package no.fint.model.resource.administrasjon.kompleksedatatyper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.administrasjon.kompleksedatatyper.KontostrengResource;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class VariabelttilleggResource implements FintComplexDatatypeObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (kontostreng != null) {
            result.add(kontostreng);
        }
        return result;
    }
    @NonNull
    private Long antall;
    private Long belop;
    @NonNull
    private String beskrivelse;
    @NonNull
    private KontostrengResource kontostreng;
    private Periode periode;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addLonnsart(Link link) {
        addLink("lonnsart", link);
    }
}
