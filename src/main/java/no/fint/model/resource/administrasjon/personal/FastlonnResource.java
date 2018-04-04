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

import no.fint.model.administrasjon.personal.Fastlonn;
import no.fint.model.administrasjon.kompleksedatatyper.Beskjeftigelse;
import no.fint.model.administrasjon.kompleksedatatyper.Fasttillegg;
import no.fint.model.administrasjon.personal.Lonn;
import no.fint.model.resource.administrasjon.kompleksedatatyper.BeskjeftigelseResource;
import no.fint.model.resource.administrasjon.kompleksedatatyper.FasttilleggResource;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class FastlonnResource extends Fastlonn implements FintLinks {
    public static FastlonnResource create(Fastlonn other) {
        if (other == null) {
            return null;
        }
        if (other instanceof FastlonnResource) {
            return (FastlonnResource)other;
        }
        FastlonnResource result = new FastlonnResource();
        result.setBeskjeftigelse(other.getBeskjeftigelse());
        result.setFasttillegg(other.getFasttillegg());
        result.setAnvist(other.getAnvist());
        result.setAttestert(other.getAttestert());
        result.setKontert(other.getKontert());
        result.setPeriode(other.getPeriode());
        result.setSystemId(other.getSystemId());
        return result;
    }
    // Resources
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = new ArrayList<>();
        if (getBeskjeftigelse() != null) {
            result.addAll(getBeskjeftigelse().stream().map(BeskjeftigelseResource::create).collect(Collectors.toList()));
        }
        if (getFasttillegg() != null) {
            result.addAll(getFasttillegg().stream().map(FasttilleggResource::create).collect(Collectors.toList()));
        }
        return result;
    }
    
    @JsonSetter
    @Override
    public void setBeskjeftigelse(List<Beskjeftigelse> beskjeftigelse) {
        super.setBeskjeftigelse(beskjeftigelse.stream().map(BeskjeftigelseResource::create).collect(Collectors.toList()));
    }
    @JsonSetter
    @Override
    public void setFasttillegg(List<Fasttillegg> fasttillegg) {
        super.setFasttillegg(fasttillegg.stream().map(FasttilleggResource::create).collect(Collectors.toList()));
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
