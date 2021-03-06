package com.jos.dem.kata

import spock.lang.Specification

class OddFinderSpec extends Specification {

    def oddFinder = new OddFinder()

    void "should find the odd"(){
        when: "I call finder"
        def result = oddFinder.find(array)
        then: "I verify odd value"
        result == expectedResult
        where:
        array                                                       |   expectedResult
        [20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5]   |   5
        [1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5]                        |   -1
        [20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5]                   |   5
        [10]                                                        |   10
        [1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1]                          |   10
        [5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10]                         |   1
    }

}
