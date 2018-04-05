package no.fint.test.model

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.util.ISO8601DateFormat
import groovy.json.JsonSlurper
import no.fint.model.administrasjon.kompleksedatatyper.Beskjeftigelse
import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng
import no.fint.model.administrasjon.personal.Fastlonn
import no.fint.model.felles.kompleksedatatyper.Identifikator
import no.fint.model.felles.kompleksedatatyper.Periode
import no.fint.model.resource.Link
import no.fint.model.resource.administrasjon.kompleksedatatyper.BeskjeftigelseResource
import no.fint.model.resource.administrasjon.kompleksedatatyper.KontostrengResource
import no.fint.model.resource.administrasjon.personal.FastlonnResource
import spock.lang.Specification

class ModelSerializationSpec extends Specification {
    def objectMapper
    def jsonSlurper

    void setup() {
        objectMapper = new ObjectMapper()
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
        objectMapper.setDateFormat(new ISO8601DateFormat());
        jsonSlurper = new JsonSlurper()
    }

    def "Serialize Fastlonn without Links"() {
        given:
        def fastlonn = new Fastlonn(
                systemId: new Identifikator(identifikatorverdi: "ABC123"),
                attestert: new Date(System.currentTimeMillis()-10000),
                anvist: new Date(),
                periode: new Periode(start: new Date()),
                beskjeftigelse: [ new Beskjeftigelse(prosent: 10000, beskrivelse: "Test", kontostreng: new Kontostreng()) ],
                fasttillegg: []
        )

        when:
        def result = objectMapper.writeValueAsString(fastlonn)
        println(result)
        def object = jsonSlurper.parseText(result)

        then:
        object
        object.beskjeftigelse[0].prosent
    }

    def "Serialize FastlonnResource with only own links"() {
        given:
        def fastlonn = new FastlonnResource(
                systemId: new Identifikator(identifikatorverdi: "ABC123"),
                attestert: new Date(System.currentTimeMillis()-10000),
                anvist: new Date(),
                periode: new Periode(start: new Date()),
                beskjeftigelse: [ new BeskjeftigelseResource(prosent: 10000, beskrivelse: "Test", kontostreng: new KontostrengResource()) ]
        )
        fastlonn.addArbeidsforhold(Link.with("/administrasjon/personal/arbeidsforhold/systemid/1234"))

        when:
        def result = objectMapper.writeValueAsString(fastlonn)
        println(result)
        def object = jsonSlurper.parseText(result)

        then:
        object
        object._links.arbeidsforhold
    }

    def "Serialize FastlonnResource with deep links"() {
        given:
        def kontostreng = new KontostrengResource()
        kontostreng.addArt(Link.with("/administrasjon/kodeverk/art/systemid/1"))
        kontostreng.addAnsvar(Link.with("/administrasjon/kodeverk/ansvar/systemid/2"))
        kontostreng.addFunksjon(Link.with("/administrasjon/kodeverk/funksjon/systemid/3"))
        def fastlonn = new FastlonnResource(
                systemId: new Identifikator(identifikatorverdi: "ABC123"),
                attestert: new Date(System.currentTimeMillis()-10000),
                anvist: new Date(),
                periode: new Periode(start: new Date()),
        )
        def beskjeftigelse = new BeskjeftigelseResource(prosent: 10000, beskrivelse: "Test", kontostreng: kontostreng)
        beskjeftigelse.addLonnsart(Link.with("/administrasjon/kodeverk/lonnsart/systemid/4"))
        fastlonn.addArbeidsforhold(Link.with("/administrasjon/personal/arbeidsforhold/systemid/1234"))
        fastlonn.setBeskjeftigelse([ beskjeftigelse ] )

        when:
        def result = objectMapper.writeValueAsString(fastlonn)
        println(result)
        def object = jsonSlurper.parseText(result)

        then:
        object
        object._links.arbeidsforhold
        object.beskjeftigelse[0].kontostreng._links.art
    }
}
