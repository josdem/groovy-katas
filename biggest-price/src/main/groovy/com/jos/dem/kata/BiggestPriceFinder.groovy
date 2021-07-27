package com.jos.dem.kata

/*
Messages with random data are coming! But we just care about prices!
Your task is to implement a function which removes all non numeric data and return just the biggest price in the collection
messages = ["hi", "2.0", "@#$%", "32.0"]
result = 32.0
*/

class BiggestPriceFinder {

    private def regex = "-?[0-9]+.?[0-9]+"

    def find(prices) {
        prices.findAll { it.matches(regex) }.collect { Double.parseDouble(it) }.max()
    }
}
