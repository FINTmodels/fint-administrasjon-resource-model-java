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

import no.fint.model.administrasjon.kompleksedatatyper.Fasttillegg;
import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.resource.administrasjon.kompleksedatatyper.KontostrengResource;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class FasttilleggResource extends Fasttillegg implements FintLinks {
    public FasttilleggResource(Fasttillegg other) {
        this.setKontostreng(other.getKontostreng());
    }

    // Resources
    @Getter
    private KontostrengResource kontostreng;

    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = new ArrayList<>();
        result.add(kontostreng);
        return result;
    }
    

    @JsonSetter
    @Override
    public void setKontostreng(Kontostreng _kontostreng) {
        this.kontostreng = KontostrengResource.class.cast(_kontostreng);
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addLonnsart(Link link) {
        addLink("lonnsart", link);
    }
}
