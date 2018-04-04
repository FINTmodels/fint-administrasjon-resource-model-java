// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.personal;

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

import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class PersonalressursResource extends Personalressurs implements FintLinks {
    public static PersonalressursResource create(Personalressurs other) {
        if (other == null) {
            return null;
        }
        if (other instanceof PersonalressursResource) {
            return (PersonalressursResource)other;
        }
        PersonalressursResource result = new PersonalressursResource();
        result.setAnsattnummer(other.getAnsattnummer());
        result.setAnsettelsesperiode(other.getAnsettelsesperiode());
        result.setBrukernavn(other.getBrukernavn());
        result.setKontaktinformasjon(other.getKontaktinformasjon());
        result.setSystemId(other.getSystemId());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addPersonalressurskategori(Link link) {
        addLink("personalressurskategori", link);
    }
    public void addArbeidsforhold(Link link) {
        addLink("arbeidsforhold", link);
    }
    public void addPerson(Link link) {
        addLink("person", link);
    }
    public void addStedfortreder(Link link) {
        addLink("stedfortreder", link);
    }
    public void addFullmakt(Link link) {
        addLink("fullmakt", link);
    }
    public void addLeder(Link link) {
        addLink("leder", link);
    }
    public void addPersonalansvar(Link link) {
        addLink("personalansvar", link);
    }
}
