package com.jos.dem.kata

import spock.lang.Specification

class CommonElementsSpec extends Specification {

    def finder = new CommonElements()

    void "should filter common elements"() {
        when: "I call finder"
        def result = finder.find(first, second)
        then: "I verify common elements"
        result == expectedResult
        where:
        first           | second          | expectedResult
        [1, 2, 3, 4, 5] | [1, 3, 5, 7, 9] | [1, 3, 5]
    }
}
