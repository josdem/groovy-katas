package com.jos.dem.kata

/*
Given: A string and a character
When: We call count character method
Then: I count how many times this character appears in the string
 */

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
