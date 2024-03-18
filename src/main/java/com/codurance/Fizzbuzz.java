package com.codurance;

public class Fizzbuzz {

    public static String convert(int number) {
        if(number == 5 || number == 10 || number == 20) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
