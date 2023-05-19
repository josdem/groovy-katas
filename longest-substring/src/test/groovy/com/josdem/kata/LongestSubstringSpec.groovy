package com.josdem.kata

import spock.lang.Specification

/**
 * Given A string
 * When I call reduce method
 * Then I should have the length of a new string without repeated characters
 *
 * Examples:
 * 1. abcabcbb -> abc = 3
 * 2. bbbbb -> b = 1
 * 3. ABDEFGABEF -> BDEFGA = 6
 */

class LongestSubstringSpec extends Specification {
    private def longestSubstring = new LongestSubstring()

    void "finding longest substring"(){
        expect:
        longestSubstring.reduce(string) == result

        where:
        string | result
        "abcabcbb" | 3
        "bbbbb" | 1
        "ABDEFGABEF" | 6
    }
}
