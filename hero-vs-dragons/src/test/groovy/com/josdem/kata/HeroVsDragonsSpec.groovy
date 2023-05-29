package com.josdem.kata

/**
 * Given number of bullets and number of dragons
 * When I call fight method
 * Then return true if hero wins the fight
 * Note: Each dragon takes 2 bullets to be defeated
 */

import spock.lang.Specification

class HeroVsDragonsSpec extends Specification {

    void "should return true when hero is stronger that dragons"() {
        given:
        def heroVsDragons = new HeroVsDragons()

        when:
        def result = heroVsDragons.fight(bullets, dragons)

        then:
        result == expectedResult

        where:
        bullets    | dragons    | expectedResult
        10         | 5          | true
        100        | 40         | true
        1706635620 | 1391914725 | false
    }
}
