// Built from tag v2.8.0

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
import no.fint.model.resource.administrasjon.kompleksedatatyper.BeskjeftigelseResource;
import no.fint.model.resource.administrasjon.kompleksedatatyper.FasttilleggResource;
import no.fint.model.administrasjon.personal.Lonn;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class FastlonnResource extends Lonn implements FintMainObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (beskjeftigelse != null) {
            result.addAll(beskjeftigelse);
        }
        if (fasttillegg != null) {
            result.addAll(fasttillegg);
        }
        return result;
    }
    @NonNull
    private List<BeskjeftigelseResource> beskjeftigelse;
    @NonNull
    private List<FasttilleggResource> fasttillegg;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        

    @JsonIgnore
    public List<Link> getAnviser() {
        return getLinks().getOrDefault("anviser", Collections.emptyList()); 
    }
    public void addAnviser(Link link) {
        addLink("anviser", link);
    }

    @JsonIgnore
    public List<Link> getKonterer() {
        return getLinks().getOrDefault("konterer", Collections.emptyList()); 
    }
    public void addKonterer(Link link) {
        addLink("konterer", link);
    }

    @JsonIgnore
    public List<Link> getAttestant() {
        return getLinks().getOrDefault("attestant", Collections.emptyList()); 
    }
    public void addAttestant(Link link) {
        addLink("attestant", link);
    }

    @JsonIgnore
    public List<Link> getArbeidsforhold() {
        return getLinks().getOrDefault("arbeidsforhold", Collections.emptyList()); 
    }
    public void addArbeidsforhold(Link link) {
        addLink("arbeidsforhold", link);
    }
}
