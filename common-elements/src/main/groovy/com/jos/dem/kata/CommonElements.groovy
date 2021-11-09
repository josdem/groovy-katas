package com.jos.dem.kata

/*
I have two arrays with integers. I want to return elements in common.
Given: [1,2,3,4,5] and [1,3,5,7,9] then expected output: [1,3,5]
*/

class CommonElements {

    def find(first, second) {
        first.intersect(second)
    }
}
