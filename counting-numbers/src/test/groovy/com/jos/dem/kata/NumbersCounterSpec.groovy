package com.jos.dem.kata

import spock.lang.Specification

class NumbersCounterSpec extends Specification {

    def numbersCounter = new NumbersCounter()

    void "should count numbers"(){
        when: "I call to count numbers"
          def result = numbersCounter.count(numbers)
        then: "I validate result"
          result == expectedResult
        where:
        numbers | expectedResult
        [-4, 3, -9, 0, 4, 1]  |   [3, 2, 1]
    }
}
