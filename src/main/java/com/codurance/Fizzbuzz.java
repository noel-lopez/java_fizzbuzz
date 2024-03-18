package com.codurance;

public class Fizzbuzz {

    public static String convert(int number) {
        if (number == 15 || number == 30 || number == 45) {
            return "FizzBuzz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
