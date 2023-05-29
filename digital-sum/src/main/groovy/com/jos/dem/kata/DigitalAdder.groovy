package com.jos.dem.kata

class DigitalAdder {
    def sum(def numbers) {
        def numbersAsString = numbers.collect { it.toString() }
        def collection = numbersAsString.collect(string -> string.split('').collect(it -> it as Integer))
        collection.collect(it -> it.sum())
    }
}
