package com.jos.dem.kata

/*
Given an array of integers, find the one that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
 */

class OddFinder {

    def find(def array){
        array.find(n -> array.findAll {it == n}.size() % 2)
    }
}
