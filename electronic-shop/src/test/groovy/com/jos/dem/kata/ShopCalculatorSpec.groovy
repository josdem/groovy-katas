package com.jos.dem.kata

/*
Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics store.
The store sells N different brands of keyboards and M different brands of USB drives.
Monica has exactly S dollars to spend, and she wants to spend as much of it as possible (i.e., the total cost of her purchase must be maximal).
Given: Amount of money Monica has to spend in electronics as 10
And: Keyboards prices as [3, 1]
And: Usbs' prices as [5, 2, 8]
When: I call to compute method
Then: I will have 9 as result
 */

import spock.lang.Specification

class ShopCalculatorSpec extends Specification {

    def shopCalculator = new ShopCalculator()

    void "should get biggest electronic pair spend"(){
        given: "User and store inputs"
            def amount = 10
            def usbs = [5, 2, 8]
            def keyboards = [3, 1]
        when: "I call to the shop calculator"
            def result = shopCalculator.compute(amount, usbs, keyboards)
        then: "I validate expected shopping spend"
            result == 9
    }
}
