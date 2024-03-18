package com.codurance;

public class Fizzbuzz {

    public static String convert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
