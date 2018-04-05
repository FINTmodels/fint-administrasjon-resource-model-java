package no.fint.test.model

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException
import no.fint.model.administrasjon.personal.Fastlonn
import no.fint.model.resource.administrasjon.personal.FastlonnResource
import spock.lang.Specification

class ModelDeserializationSpec extends Specification {
    def objectMapper

    void setup() {
        objectMapper = new ObjectMapper()
    }

    def "Read Fastlonn from fastlonn.json"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonn.json")

        when:
        def result = objectMapper.readValue(input, Fastlonn.class)
        println(result)

        then:
        result
        result.anvist
        result.periode.start
        result.systemId.identifikatorverdi == "ABC123"
        result.beskjeftigelse[0].beskrivelse == "Test"
        result.beskjeftigelse[0].periode.start
        result.beskjeftigelse[0].prosent == 10000
        result.beskjeftigelse[0].kontostreng
    }

    def "Read FastlonnResource from fastlonn.json"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonn.json")

        when:
        def result = objectMapper.readValue(input, FastlonnResource.class)
        println(result)

        then:
        result
        result.anvist
        result.periode.start
        result.systemId.identifikatorverdi == "ABC123"
        result.beskjeftigelse[0].beskrivelse == "Test"
        result.beskjeftigelse[0].periode.start
        result.beskjeftigelse[0].prosent == 10000
        result.beskjeftigelse[0].kontostreng
    }

    def "Read Fastlonn from fastlonnresource.json"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonnresource.json")

        when:
        def result = objectMapper.readValue(input, Fastlonn.class)
        println(result)

        then:
        thrown(UnrecognizedPropertyException)
    }

    def "Read Fastlonn from fastlonnresource.json with ObjectMapper config"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonnresource.json")
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        when:
        def result = objectMapper.readValue(input, Fastlonn.class)
        println(result)

        then:
        result
        result.anvist
        result.periode.start
        result.systemId.identifikatorverdi == "ABC123"
        result.beskjeftigelse[0].beskrivelse == "Test"
        result.beskjeftigelse[0].periode.start
        result.beskjeftigelse[0].prosent == 10000
        result.beskjeftigelse[0].kontostreng
    }

    def "Read FastlonnResource from fastlonnresource.json"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonnresource.json")

        when:
        def result = objectMapper.readValue(input, FastlonnResource.class)
        println(result)

        then:
        result
        result.anvist
        result.periode.start
        result.systemId.identifikatorverdi == "ABC123"
        result.beskjeftigelse[0].beskrivelse == "Test"
        result.beskjeftigelse[0].periode.start
        result.beskjeftigelse[0].prosent == 10000
        result.beskjeftigelse[0].kontostreng
        result.links.size() == 1
    }

    def "Read Fastlonn from fastlonnresourcelinks.json"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonnresourcelinks.json")

        when:
        def result = objectMapper.readValue(input, Fastlonn.class)
        println(result)

        then:
        thrown(UnrecognizedPropertyException)
    }

    def "Read Fastlonn from fastlonnresourcelinks.json with ObjectMapper config"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonnresourcelinks.json")
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        when:
        def result = objectMapper.readValue(input, Fastlonn.class)
        println(result)

        then:
        result
        result.anvist
        result.periode.start
        result.systemId.identifikatorverdi == "ABC123"
        result.beskjeftigelse[0].beskrivelse == "Test"
        result.beskjeftigelse[0].periode.start
        result.beskjeftigelse[0].prosent == 10000
        result.beskjeftigelse[0].kontostreng
    }

    def "Read FastlonnResource from fastlonnresourcelinks.json"() {
        given:
        def input = getClass().getResourceAsStream("/fastlonnresourcelinks.json")

        when:
        def result = objectMapper.readValue(input, FastlonnResource.class)
        println(result)

        then:
        result
        result.anvist
        result.periode.start
        result.systemId.identifikatorverdi == "ABC123"
        result.beskjeftigelse[0].beskrivelse == "Test"
        result.beskjeftigelse[0].periode.start
        result.beskjeftigelse[0].prosent == 10000
        result.beskjeftigelse[0].kontostreng
        result.links.size() == 1
        result.beskjeftigelse[0].links.size() == 1
        result.beskjeftigelse[0].kontostreng.links.size() == 3
    }

    /*
    def "Read PersonResources from personresourceslinks.json"() {
        given:
        def input = getClass().getResourceAsStream("/personresourceslinks.json")

        when:
        def result = objectMapper.readValue(input, FastlonnResource.class)
        println(result)

        then:
        result
        result.getTotalItems() == 1
        result.links.self.size() == 1
        result._embedded._entries[0].bostedsadresse
        result._embedded._entries[0].postadresse
    }
    */
}
