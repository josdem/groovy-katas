package com.jos.dem.kata

/*
 * Counting vowels and consonants. Create two functions one for counting vowels and another for counting consonants
 * Given: A string
 * When: That string is josdem
 * Then: Counting vowels should be 2 and consonants 4
 */

class CharactersCounter {

    def vowels = ['a', 'e', 'i', 'o', 'u']
    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'r', 'p', 'q', 's', 't', 'v', 'w',
                      'x', 'y', 'z']

    def countVowels(keyword) {
        keyword.findAll { vowels.contains(it) }.size()
    }

    def countConsonants(keyword) {
        keyword.findAll { consonants.contains(it) }.size()
    }
}
