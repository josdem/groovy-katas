package com.jos.dem.kata

import spock.lang.Specification

class CharactersCounterSpec extends Specification {

    private def charactersCounter = new CharactersCounter()

    void "should count vowels"() {
        when: "I call vowels counter"
        def result = charactersCounter.countVowels("josdem")
        then: "I verify vowels quantity"
        result == 2
    }

    void "should countconsonants"() { when: "I call consonants counter"
        def result = charactersCounter.countConsonants("josdem")
        then: "I verify consonants quantity"
        result == 4
    }

}
