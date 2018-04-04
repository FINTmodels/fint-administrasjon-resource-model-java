// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.kompleksedatatyper;

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

import no.fint.model.administrasjon.kompleksedatatyper.Variabelttillegg;
import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.resource.administrasjon.kompleksedatatyper.KontostrengResource;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class VariabelttilleggResource extends Variabelttillegg implements FintLinks {
    public static VariabelttilleggResource create(Variabelttillegg other) {
        if (other == null) {
            return null;
        }
        if (other instanceof VariabelttilleggResource) {
            return (VariabelttilleggResource)other;
        }
        VariabelttilleggResource result = new VariabelttilleggResource();
        result.setAntall(other.getAntall());
        result.setBelop(other.getBelop());
        result.setBeskrivelse(other.getBeskrivelse());
        result.setKontostreng(other.getKontostreng());
        result.setPeriode(other.getPeriode());
        return result;
    }
    // Resources
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = new ArrayList<>();
        if (getKontostreng() != null) {
            result.add(KontostrengResource.create(getKontostreng()));
        }
        return result;
    }
    
    @JsonSetter
    @Override
    public void setKontostreng(Kontostreng kontostreng) {
        super.setKontostreng(KontostrengResource.create(kontostreng));
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addLonnsart(Link link) {
        addLink("lonnsart", link);
    }
}
