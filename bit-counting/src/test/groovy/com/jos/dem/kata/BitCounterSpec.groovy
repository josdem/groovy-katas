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
        1234    |   5
        4       |   1
        7       |   3
        9       |   2
        10      |   2
    }

}
