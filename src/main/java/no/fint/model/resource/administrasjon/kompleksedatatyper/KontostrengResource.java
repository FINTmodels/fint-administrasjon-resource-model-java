// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.kompleksedatatyper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class KontostrengResource extends Kontostreng implements FintLinks {
    public static KontostrengResource create(Kontostreng other) {
        if (other == null) {
            return null;
        }
        if (other instanceof KontostrengResource) {
            return (KontostrengResource)other;
        }
        KontostrengResource result = new KontostrengResource();
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addAnsvar(Link link) {
        addLink("ansvar", link);
    }
    public void addArt(Link link) {
        addLink("art", link);
    }
    public void addFunksjon(Link link) {
        addLink("funksjon", link);
    }
    public void addProsjekt(Link link) {
        addLink("prosjekt", link);
    }
}
