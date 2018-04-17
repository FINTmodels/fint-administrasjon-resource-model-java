// Built from tag v2.7.0

package no.fint.model.resource.administrasjon.personal;

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

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FravarResource implements FintMainObject, FintLinks {
    // Attributes
    @NonNull
    private Periode periode;
    @NonNull
    private Long prosent;
    @NonNull
    private Identifikator systemId;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addFravarsgrunn(Link link) {
        addLink("fravarsgrunn", link);
    }
    public void addFravarstype(Link link) {
        addLink("fravarstype", link);
    }
    public void addArbeidsforhold(Link link) {
        addLink("arbeidsforhold", link);
    }
    public void addFortsettelse(Link link) {
        addLink("fortsettelse", link);
    }
    public void addFortsetter(Link link) {
        addLink("fortsetter", link);
    }
}
