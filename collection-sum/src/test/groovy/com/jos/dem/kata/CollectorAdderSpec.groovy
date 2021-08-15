package com.jos.dem.kata

import spock.lang.Specification

class CollectorAdderSpec extends Specification {

    def collectionAdder = new CollectorAdder()

    void "should sum collection"(){
        when: "I call to collection adder"
          def result = collectionAdder.sum(numbers)
        then: "I verify sum"
          result == expectedValue
        where:
          numbers               | expectedValue
        [1, 2, 3, 4, 10, 11]    | 31
        [5, 4, 1, 2, 9]         | 21
    }

}
