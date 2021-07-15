package com.jos.dem.kata

import spock.lang.Specification

class BitCounterSpec extends Specification {

    def bitCounter = new BitCounter()

    void "should count bits"(){
        when: "I count bits"
        def result = bitCounter.countBits(number)
        then: "I verify bits quantity"
        result == expectedResult
        where:
        number  |   expectedResult
        5       |   1234
        1       |   4
        3       |   7
        2       |   9
        2       |   10
    }

}
