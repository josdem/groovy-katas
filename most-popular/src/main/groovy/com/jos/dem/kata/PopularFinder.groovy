package com.jos.dem.kata

/*
Given a collection with numbers: [34 , 31, 34, 56, 12, 35, 24, 34, 69, 18]
Write a function that finds most popular number in the array, in this case 34 because it is the number that appears most often.
 */

class PopularFinder {

    def find(def numbers){
        numbers.groupBy { numbers.count(it) }.max{ it.key }.value[0]
    }
}
