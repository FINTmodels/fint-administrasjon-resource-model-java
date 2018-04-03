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

import no.fint.model.administrasjon.personal.Variabellonn;
import no.fint.model.administrasjon.kompleksedatatyper.Variabelttillegg;
import no.fint.model.administrasjon.personal.Lonn;
import no.fint.model.resource.administrasjon.kompleksedatatyper.VariabelttilleggResource;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class VariabellonnResource extends Variabellonn implements FintLinks {
    // Resources
    private List<VariabelttilleggResource> variabelttillegg;

    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = new ArrayList<>();
        result.addAll(variabelttillegg);
        return result;
    }
    

    @JsonSetter
    @Override
    public void setVariabelttillegg(List<Variabelttillegg> _variabelttillegg) {
        this.variabelttillegg = _variabelttillegg == null ? null : _variabelttillegg.stream().map(VariabelttilleggResource.class::cast).collect(Collectors.toList());
    }

    // Links
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
