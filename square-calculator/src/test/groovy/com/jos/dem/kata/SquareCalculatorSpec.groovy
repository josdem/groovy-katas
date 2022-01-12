package com.jos.dem.kata

import spock.lang.Specification

class SquareCalculatorSpec extends Specification {

    private def squareCalculator = new SquareCalculator()

    void "should square my list"(){
        given: "A list"
          def numbers = [1, 2, 3, 7, 9, 12, 15]
        when: "I call to square method"
          def result = squareCalculator.square(numbers)
        then: "I verify result is squared"
          result == [1, 4, 9, 49, 81, 144, 225]
    }
}
