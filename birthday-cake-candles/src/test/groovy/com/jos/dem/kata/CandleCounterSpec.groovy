package com.jos.dem.kata

import spock.lang.Specification

class CandleCounterSpec extends Specification {

    def candleCounter = new CandleCounter()

    def "should select biggest candles"() {
        when: "I call to find the biggest candles"
          def result = candleCounter.find(candles)
        then: "I verify selected candles"
          result == expectedValues
        where:
        candles         |   expectedValues
        [3, 2, 1, 3]    |   [3, 3]
        [1]             |   [1]
    }
}
