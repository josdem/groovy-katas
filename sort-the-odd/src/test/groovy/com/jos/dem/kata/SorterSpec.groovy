package com.jos.dem.kata

import spock.lang.Specification

class SorterSpec extends Specification {

    private Sorter sorter = new Sorter()

    void "Sorting the odds"(){
        when: "I apply sorting"
        def result = sorter.sort(array)
        then: "I verify is sorted"
        result == expectedResult
        where:
        array                           | expectedResult
        [7, 1]                          |   [1, 7]
        [5, 8, 6, 3, 4]                 |   [3, 8, 6, 5, 4]
        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  |   [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
    }
}
