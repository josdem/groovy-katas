package com.jos.dem.kata

import spock.lang.Specification

class CharacterCounterSpec extends Specification {

    def characterCounter = new CharacterCounter()

    void "should count last character"(){
        given: "A string and a character"
          def keyword = k
          def character = ch
        when: "I call to the count method"
          def result = characterCounter.count(keyword, character)
        then: "I validate expected result"
          result == expectedResult
        where:
        k           | ch                || expectedResult
        "josdem"    | "m" as Character  || 1
        "Alabama"   | "a" as Character  || 3
    }
}
