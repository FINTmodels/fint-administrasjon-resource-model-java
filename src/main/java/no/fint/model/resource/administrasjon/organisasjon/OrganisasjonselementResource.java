// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.organisasjon;

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

import no.fint.model.administrasjon.organisasjon.Organisasjonselement;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Enhet;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class OrganisasjonselementResource extends Organisasjonselement implements FintLinks {

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addAnsvar(Link link) {
        addLink("ansvar", link);
    }
    public void addLeder(Link link) {
        addLink("leder", link);
    }
    public void addOverordnet(Link link) {
        addLink("overordnet", link);
    }
    public void addUnderordnet(Link link) {
        addLink("underordnet", link);
    }
    public void addSkole(Link link) {
        addLink("skole", link);
    }
    public void addArbeidsforhold(Link link) {
        addLink("arbeidsforhold", link);
    }
}
