package com.jos.dem.kata

import spock.lang.Specification

class BiggestPriceFinderSpec extends Specification {

    def biggestPriceFinder = new BiggestPriceFinder()

    void "should find biggest price"(){
        when: "I call to find the biggest price"
          def result = biggestPriceFinder.find(data)
        then: "I verify biggest price"
          result == expectedResult
        where:
        data                            |   expectedResult
        ['hi', '2.0', '@#$%', '32.0']   |   32.0
        ['pair', 'car', '-10.0']        |   -10.0
        ['main', '3.14', 'yaml']        |   3.14
    }
}
