// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.organisasjon;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import no.fint.model.administrasjon.organisasjon.Organisasjonselement;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.felles.kompleksedatatyper.AdresseResource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class OrganisasjonselementResource extends Organisasjonselement implements FintLinks {
    public static OrganisasjonselementResource create(Organisasjonselement other) {
        if (other == null) {
            return null;
        }
        if (other instanceof OrganisasjonselementResource) {
            return (OrganisasjonselementResource)other;
        }
        OrganisasjonselementResource result = new OrganisasjonselementResource();
        result.setGyldighetsperiode(other.getGyldighetsperiode());
        result.setKortnavn(other.getKortnavn());
        result.setNavn(other.getNavn());
        result.setOrganisasjonsId(other.getOrganisasjonsId());
        result.setOrganisasjonsKode(other.getOrganisasjonsKode());
        result.setForretningsadresse(other.getForretningsadresse());
        result.setOrganisasjonsnavn(other.getOrganisasjonsnavn());
        result.setOrganisasjonsnummer(other.getOrganisasjonsnummer());
        result.setKontaktinformasjon(other.getKontaktinformasjon());
        result.setPostadresse(other.getPostadresse());
        return result;
    }
    // Resources
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = new ArrayList<>();
        if (getForretningsadresse() != null) {
            result.add(AdresseResource.create(getForretningsadresse()));
        }
        if (getPostadresse() != null) {
            result.add(AdresseResource.create(getPostadresse()));
        }
        return result;
    }
    
    @JsonSetter
    @Override
    public void setForretningsadresse(Adresse forretningsadresse) {
        super.setForretningsadresse(AdresseResource.create(forretningsadresse));
    }
    @JsonSetter
    @Override
    public void setPostadresse(Adresse postadresse) {
        super.setPostadresse(AdresseResource.create(postadresse));
    }

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
