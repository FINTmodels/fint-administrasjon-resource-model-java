// Built from tag v2.6.0

package no.fint.model.resource.administrasjon.fullmakt;

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
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class RolleResource implements FintMainObject, FintLinks {
    // Attributes
    @NonNull
    private String beskrivelse;
    @NonNull
    private Identifikator navn;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addFullmakt(Link link) {
        addLink("fullmakt", link);
    }
}
