// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.fullmakt;

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

import no.fint.model.administrasjon.fullmakt.Fullmakt;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class FullmaktResource extends Fullmakt implements FintLinks {

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addMyndighet(Link link) {
        addLink("myndighet", link);
    }
    public void addStedfortreder(Link link) {
        addLink("stedfortreder", link);
    }
    public void addFullmektig(Link link) {
        addLink("fullmektig", link);
    }
    public void addRolle(Link link) {
        addLink("rolle", link);
    }
}
