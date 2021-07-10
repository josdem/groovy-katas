package com.jos.dem.kata

class PhoneNumberGenerator {

    def generate(array){
        def arrayAsString =  array.join('')
        '(' + arrayAsString[0..2] + ') ' + arrayAsString[3..5] + '-' + arrayAsString[6..-1]
    }
}
