package com.jos.dem.kata

import spock.lang.Specification

class CharacterCounterSpec extends Specification {

    def characterCounter = new CharacterCounter()

    void "should count last character"(){
        given: "A string and a character"
          def keyword = "josdem"
          def character = 'm' as Character
        when: "I call to the count method"
          def result = characterCounter.count(keyword, character)
        then: "I validate expected result"
          result == 1
    }
}
