package com.jos.dem.kata

/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
 */

class Differentiator {

    def diff(a, b){
        def result = []
        a.each {
            if(!b.contains(it)) {
                result << it
            }
        }
        result
    }
}
