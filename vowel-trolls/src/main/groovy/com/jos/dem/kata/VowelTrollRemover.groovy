package com.jos.dem.kata

/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
 */

class VowelTrollRemover {

    def remove(def keyword) {
        def result = ''
        keyword.each { ch ->
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A'
                    && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                result = result + ch
            }
        }
        result
    }
}
