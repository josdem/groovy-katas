package com.jos.dem.kata

import spock.lang.Specification

class SmallestBiggestFinderSpec extends Specification {

    def smallestBiggestFinder = new SmallestBiggestFinder()

    void "should find smallest and biggest"(){
        when: "I call finder"
        def result = smallestBiggestFinder.find([7, 5, 2, 4, 3, 9])
        then: "I validate is expected result"
        result == [2, 9]
    }
}
