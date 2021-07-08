package com.jos.dem.kata

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

class Sorter {

    int[] sort(int[] array){
        int index = 0
        def odds = array.findAll(it -> it % 2 == 1).sort()
        array.each {it -> it %2 == 1 ? odds.remove(index++) : it}.collect()
    }
}
