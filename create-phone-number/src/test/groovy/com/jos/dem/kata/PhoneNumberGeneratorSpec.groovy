package com.jos.dem.kata

import spock.lang.Specification

class PhoneNumberGeneratorSpec extends Specification {

    private PhoneNumberGenerator phoneNumberGenerator = new PhoneNumberGenerator()

    void "Generate Phone Number"() {
        expect:
        phoneNumberGenerator.generate([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) == "(123) 456-7890"
    }

}
