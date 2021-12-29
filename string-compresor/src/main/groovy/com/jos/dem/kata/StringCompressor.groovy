package com.jos.dem.kata

/*
Given a string "aaabbbbcc"
When we call compress method
Then we have a compressed string like "a3b4c2"
 */

class StringCompressor {
    def compress(String keyword) {
        def result = new StringBuilder()
        def array = keyword.split('')
        def map = array.groupBy {array.count (it)}
        map.each {result << it.value[0] << it.key}
        result.toString()
    }
}
