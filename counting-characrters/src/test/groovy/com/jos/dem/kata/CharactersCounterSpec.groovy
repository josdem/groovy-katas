package com.jos.dem.kata

import spock.lang.Specification

class CharactersCounterSpec extends Specification {

    private static final def KEYWORD = "josdem"
    private def charactersCounter = new CharactersCounter()

    void "should count vowels"() {
        when: "I call vowels counter"
        def result = charactersCounter.countVowels(KEYWORD)
        then: "I verify vowels quantity"
        result == 2
    }

    void "should count consonants"() { when: "I call consonants counter"
        def result = charactersCounter.countConsonants(KEYWORD)
        then: "I verify consonants quantity"
        result == 4
    }

}
