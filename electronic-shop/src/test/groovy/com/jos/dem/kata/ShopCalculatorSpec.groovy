package com.jos.dem.kata

import spock.lang.Specification

class ShopCalculatorSpec extends Specification {

    def shopCalculator = new ShopCalculator()

    void "should get biggest electronic pair spend"(){
        given: "User and store inputs"
            def amount = 10
            def usbs = [5, 2, 8]
            def keywords = [3, 1]
        when: "I call to the shop calculator"
            def result = shopCalculator.compute(amount, usbs, keywords)
        then: "I validate expected shopping spend"
            result == 9
    }
}
