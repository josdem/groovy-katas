package com.jos.dem.kata

import spock.lang.Specification

class StringCompressorSpec extends Specification {

    def stringCompressor = new StringCompressor()

    void "should compress a string"() {
        when: "I call to compress method"
        def result = stringCompressor.compress(keyword)
        then: "I verify is a compressed string"
        result == expectedResult
        where:
        keyword     | expectedResult
        "aaabbbbcc" | "a3b4c2"

    }
}
