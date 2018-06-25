// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.personal;

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
        

    @JsonIgnore
    public List<Link> getAnsvar() {
        return getLinks().getOrDefault("ansvar", Collections.emptyList()); 
    }
    public void addAnsvar(Link link) {
        addLink("ansvar", link);
    }

    @JsonIgnore
    public List<Link> getArbeidsforholdstype() {
        return getLinks().getOrDefault("arbeidsforholdstype", Collections.emptyList()); 
    }
    public void addArbeidsforholdstype(Link link) {
        addLink("arbeidsforholdstype", link);
    }

    @JsonIgnore
    public List<Link> getFunksjon() {
        return getLinks().getOrDefault("funksjon", Collections.emptyList()); 
    }
    public void addFunksjon(Link link) {
        addLink("funksjon", link);
    }

    @JsonIgnore
    public List<Link> getStillingskode() {
        return getLinks().getOrDefault("stillingskode", Collections.emptyList()); 
    }
    public void addStillingskode(Link link) {
        addLink("stillingskode", link);
    }

    @JsonIgnore
    public List<Link> getTimerPerUke() {
        return getLinks().getOrDefault("timerPerUke", Collections.emptyList()); 
    }
    public void addTimerPerUke(Link link) {
        addLink("timerPerUke", link);
    }

    @JsonIgnore
    public List<Link> getArbeidssted() {
        return getLinks().getOrDefault("arbeidssted", Collections.emptyList()); 
    }
    public void addArbeidssted(Link link) {
        addLink("arbeidssted", link);
    }

    @JsonIgnore
    public List<Link> getPersonalleder() {
        return getLinks().getOrDefault("personalleder", Collections.emptyList()); 
    }
    public void addPersonalleder(Link link) {
        addLink("personalleder", link);
    }

    @JsonIgnore
    public List<Link> getFravar() {
        return getLinks().getOrDefault("fravar", Collections.emptyList()); 
    }
    public void addFravar(Link link) {
        addLink("fravar", link);
    }

    @JsonIgnore
    public List<Link> getLonn() {
        return getLinks().getOrDefault("lonn", Collections.emptyList()); 
    }
    public void addLonn(Link link) {
        addLink("lonn", link);
    }

    @JsonIgnore
    public List<Link> getPersonalressurs() {
        return getLinks().getOrDefault("personalressurs", Collections.emptyList()); 
    }
    public void addPersonalressurs(Link link) {
        addLink("personalressurs", link);
    }

    @JsonIgnore
    public List<Link> getUndervisningsforhold() {
        return getLinks().getOrDefault("undervisningsforhold", Collections.emptyList()); 
    }
    public void addUndervisningsforhold(Link link) {
        addLink("undervisningsforhold", link);
    }
}
