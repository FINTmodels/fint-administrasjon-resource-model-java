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

import no.fint.model.administrasjon.personal.Fravar;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class FravarResource extends Fravar implements FintLinks {
    public static FravarResource create(Fravar other) {
        if (other == null) {
            return null;
        }
        if (other instanceof FravarResource) {
            return (FravarResource)other;
        }
        FravarResource result = new FravarResource();
        result.setPeriode(other.getPeriode());
        result.setProsent(other.getProsent());
        result.setSystemId(other.getSystemId());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addFravarsgrunn(Link link) {
        addLink("fravarsgrunn", link);
    }
    public void addFravarstype(Link link) {
        addLink("fravarstype", link);
    }
    public void addArbeidsforhold(Link link) {
        addLink("arbeidsforhold", link);
    }
    public void addFortsettelse(Link link) {
        addLink("fortsettelse", link);
    }
    public void addFortsetter(Link link) {
        addLink("fortsetter", link);
    }
}
