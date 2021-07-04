package com.jos.dem.kata

import spock.lang.Specification

class DifferentiatorSpec extends Specification {

    private Differentiator differentiator = new Differentiator()

    void "Getting diff"() {
        when: "I apply diff"
        def result = differentiator.diff(a, b)
        then: "I verify difference"
        result == expectedResult
        where:
        a       | b     | expectedResult
        [1,2]   | [1]   | [2]
        [1,2,2] | [1]   | [2,2]
        [1,2,2] | [2]   | [1]
        [1,2,2] | []    | [1,2,2]
        []      | [1,2] | []
        [1,2,3] | [1,2] | [3]
    }
}
