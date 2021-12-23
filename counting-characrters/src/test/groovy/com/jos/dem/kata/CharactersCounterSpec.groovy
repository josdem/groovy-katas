package com.jos.dem.kata

import spock.lang.Specification

class CharactersCounterSpec extends Specification {

    private def charactersCounter = new CharactersCounter()

    void "should count vowels"(){
        when: "I call vowels counter"
          def result = charactersCounter.countVowels("josdem")
        then: "I verify vowels quantity"
          result == 2
    }

}
