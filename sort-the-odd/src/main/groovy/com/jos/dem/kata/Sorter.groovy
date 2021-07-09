package com.jos.dem.kata

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

class Sorter {

    def sort(def array){
        def index = 0
        def odds = array.findAll { it -> it % 2 == 1 }.sort()
        array.collect { it -> it % 2 == 1 ? odds[index++] : it }
    }
}
