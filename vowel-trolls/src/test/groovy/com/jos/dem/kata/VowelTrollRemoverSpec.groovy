package com.jos.dem.kata

import spock.lang.Specification

class VowelTrollRemoverSpec extends Specification {

    private VowelTrollRemover vowelTrollRemover = new VowelTrollRemover();

    void "Removing vowels"() {
        when: "I apply remover"
        def result = vowelTrollRemover.remove(message)
        then: "I verify there is no vowels"
        result == expectedResult
        where:
        message                                                             | expectedResult
        'This website is for losers LOL!'                                   | 'Ths wbst s fr lsrs LL!'
        "No offense but,\nYour writing is among the worst I've ever read"   | "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd"
        'What are you, a communist?'                                        | 'Wht r y,  cmmnst?'
    }
}