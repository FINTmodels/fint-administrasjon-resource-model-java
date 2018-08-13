// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.administrasjon.kompleksedatatyper.KontostrengResource;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class VarelinjeResource extends Begrep implements FintMainObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (kontering != null) {
            result.add(kontering);
        }
        return result;
    }
    @NonNull
    private String enhet;
    private KontostrengResource kontering;
    @NonNull
    private Long pris;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        

    @JsonIgnore
    public List<Link> getMvakode() {
        return getLinks().getOrDefault("mvakode", Collections.emptyList()); 
    }
    public void addMvakode(Link link) {
        addLink("mvakode", link);
    }

    @JsonIgnore
    public List<Link> getOppdragsgiver() {
        return getLinks().getOrDefault("oppdragsgiver", Collections.emptyList()); 
    }
    public void addOppdragsgiver(Link link) {
        addLink("oppdragsgiver", link);
    }
}
