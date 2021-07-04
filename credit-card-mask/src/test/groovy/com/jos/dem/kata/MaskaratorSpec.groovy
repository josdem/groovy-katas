package com.jos.dem.kata

import spock.lang.Specification

class MaskaratorSpec extends Specification {

    private Maskarator maskarator = new Maskarator()

    void "Doing maskarade"() {
        when: "I apply maskarade"
        def result = maskarator.maskify(keyword)
        then: "I verify maskarade is applied"
        result == expectedResult
        where:
        keyword                                     | expectedResult
        '1'                                         | '1'
        ''                                          | ''
        "4556364607935616"                          | "############5616"
        '64607935616'                               | '#######5616'
        'Nananananananananananananananana Batman!'  | '####################################man!'
    }
}
