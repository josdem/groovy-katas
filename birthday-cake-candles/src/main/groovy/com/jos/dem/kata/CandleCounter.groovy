package com.jos.dem.kata

/*
It is your birthday! And you want to make it special, so you want to keep only biggest candles in the cake
Your task is to create a function that removes all small candles and just keep the biggest ones.
 */

class CandleCounter {

    def find(candles){
        candles.findAll { it == candles.max() }
    }
}
