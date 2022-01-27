package com.jos.dem.kata

class CharacterCounter {
    def count(String keyword, Character ch) {
        keyword.split('').findAll { it == ch }.size()
    }
}
