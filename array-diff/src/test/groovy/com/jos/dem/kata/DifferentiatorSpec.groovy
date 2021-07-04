package com.jos.dem.kata

import spock.lang.Specification

class DifferentiatorSpec extends Specification {

    private Differentiator differentiator = new Differentiator()

    void "Getting diff"() {
        when: "I apply diff"
        def result = differentiator.diff([1,2], [1])
        then: "I verify difference"
        result == [2]
    }
}
