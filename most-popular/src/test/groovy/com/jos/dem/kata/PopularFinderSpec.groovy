package com.jos.dem.kata

import spock.lang.Specification

class PopularFinderSpec extends Specification {

    private def popularFinder = new PopularFinder()

    void "should find most popular"(){
        when: "I call most popular method"
          def result = popularFinder.find(numbers)
        then: "I validate most popular"
          result == expectedResult
        where:
          numbers                                   | expectedResult
        [34, 31, 34, 56, 12, 35, 24, 34, 69, 18]    | 34
    }
}
