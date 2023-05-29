package com.jos.dem.kata

class ShopCalculator {
    def compute(def amount, def usbs, def  keyboards) {
        def pairs = []
        keyboards.each {
            k -> usbs.each {
                u -> pairs.add(new Tuple2(k,u))
            }
        }
        def prices = []
        pairs.each {
            it -> prices.add(it.first + it.second)
        }
        prices.findAll(it -> it <= amount).max()
    }
}
