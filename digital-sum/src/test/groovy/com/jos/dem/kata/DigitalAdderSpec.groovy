package com.jos.dem.kata

/*
Given: A numeric collection
When: I call add method
Then: I will get a collection with every element summing its digits
 */

import spock.lang.Specification

class DigitalAdderSpec extends Specification {

    private DigitalAdder digitalAdder = new DigitalAdder()

    void "should sum every element"(){
        given: "A numeric collection"
          def numbers = [15, 20, 4, 8]
        when: "I call to sum method"
          def result = digitalAdder.sum(numbers)
        then: "I expect to have all elements added"
          result == [6, 2, 4, 8]
    }
}
