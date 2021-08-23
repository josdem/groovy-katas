package com.jos.dem.kata

import spock.lang.Specification

class NonRepeatedFinderSpec extends Specification {

    def  nonRepeatedFinder = new NonRepeatedFinder()

    void "should find most popular"() {
        when: "I call to non repeated finder"
          def result = nonRepeatedFinder.find(numbers)
        then: "I validate first non repeated number"
          result == expectedResult
        where:
          numbers                               |   expectedResult
        [25, 25, 18, 18, 18, 36, 1, 2, 2, 34]   |   36
    }

}
