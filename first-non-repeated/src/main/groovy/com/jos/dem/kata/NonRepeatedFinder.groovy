package com.jos.dem.kata

/*
Given a numbers collection find fist non-repeated number in that collection
When we have: [25, 25, 18, 18, 18, 36, 1, 2, 2, 34] first non-repeated number is 36
 */

class NonRepeatedFinder {

    def find(def numbers){
        numbers.groupBy { numbers.count(it) }.min{ it.key }.value[0]
    }
}
