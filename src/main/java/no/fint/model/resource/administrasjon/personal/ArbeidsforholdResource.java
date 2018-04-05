// Built from tag v2.6.0

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
public class ArbeidsforholdResource implements FintMainObject, FintLinks {
    // Attributes
    @NonNull
    private Long ansettelsesprosent;
    @NonNull
    private Periode gyldighetsperiode;
    @NonNull
    private Boolean hovedstilling;
    @NonNull
    private Long lonnsprosent;
    @NonNull
    private String stillingsnummer;
    private String stillingstittel;
    @NonNull
    private Identifikator systemId;
    @NonNull
    private Long tilstedeprosent;
    @NonNull
    private Long arslonn;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addAnsvar(Link link) {
        addLink("ansvar", link);
    }
    public void addArbeidsforholdstype(Link link) {
        addLink("arbeidsforholdstype", link);
    }
    public void addFunksjon(Link link) {
        addLink("funksjon", link);
    }
    public void addStillingskode(Link link) {
        addLink("stillingskode", link);
    }
    public void addTimerPerUke(Link link) {
        addLink("timerPerUke", link);
    }
    public void addArbeidssted(Link link) {
        addLink("arbeidssted", link);
    }
    public void addPersonalleder(Link link) {
        addLink("personalleder", link);
    }
    public void addFravar(Link link) {
        addLink("fravar", link);
    }
    public void addLonn(Link link) {
        addLink("lonn", link);
    }
    public void addPersonalressurs(Link link) {
        addLink("personalressurs", link);
    }
    public void addUndervisningsforhold(Link link) {
        addLink("undervisningsforhold", link);
    }
}
