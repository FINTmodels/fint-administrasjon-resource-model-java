// Built from tag v3.5.0

package no.fint.model.resource.administrasjon.kodeverk;

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
import no.fint.model.administrasjon.kodeverk.Kontodimensjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class AnsvarResource extends Kontodimensjon implements FintMainObject, FintLinks {

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getOverordnet() {
        return getLinks().getOrDefault("overordnet", Collections.emptyList()); 
    }
    public void addOverordnet(Link link) {
        addLink("overordnet", link);
    }
    @JsonIgnore
    public List<Link> getUnderordnet() {
        return getLinks().getOrDefault("underordnet", Collections.emptyList()); 
    }
    public void addUnderordnet(Link link) {
        addLink("underordnet", link);
    }
    @JsonIgnore
    public List<Link> getOrganisasjonselement() {
        return getLinks().getOrDefault("organisasjonselement", Collections.emptyList()); 
    }
    public void addOrganisasjonselement(Link link) {
        addLink("organisasjonselement", link);
    }
    @JsonIgnore
    public List<Link> getFullmakt() {
        return getLinks().getOrDefault("fullmakt", Collections.emptyList()); 
    }
    public void addFullmakt(Link link) {
        addLink("fullmakt", link);
    }
}
