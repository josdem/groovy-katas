package com.jos.dem.kata

import spock.lang.Specification

class VowelTrollRemoverSpec extends Specification {

    private VowelTrollRemover vowelTrollRemover = new VowelTrollRemover();

    void "Removing vowels"() {
        given: "A string"
        def message = 'This website is for losers LOL!'
        when: "I apply remover"
        def result = vowelTrollRemover.remove(message)
        then: "I verify there is no vowels"
        result == "Ths wbst s fr lsrs LL!"
    }
}