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
import no.fint.model.resource.administrasjon.kompleksedatatyper.VariabelttilleggResource;
import no.fint.model.administrasjon.personal.Lonn;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class VariabellonnResource extends Lonn implements FintMainObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (variabelttillegg != null) {
            result.addAll(variabelttillegg);
        }
        return result;
    }
    @NonNull
    private List<VariabelttilleggResource> variabelttillegg;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addAnviser(Link link) {
        addLink("anviser", link);
    }
    public void addKonterer(Link link) {
        addLink("konterer", link);
    }
    public void addAttestant(Link link) {
        addLink("attestant", link);
    }
    public void addArbeidsforhold(Link link) {
        addLink("arbeidsforhold", link);
    }
}
