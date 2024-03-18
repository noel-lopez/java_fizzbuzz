package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzShould {
    @ParameterizedTest(name = "{0} into {1}")
    @CsvSource({
            "1, 1",
            "2, 2",
            "4, 4",
    })
    public void convert_non_changing_numbers(int input, String output) {
        assertEquals(output, Fizzbuzz.convert(input));
    }

    @ParameterizedTest(name = "{0} into {1}")
    @CsvSource({
            "3, Fizz",
            "6, Fizz",
            "9, Fizz"
    })
    public void convert_multiples_of_3_into_Fizz(int input, String output) {
        assertEquals(output, Fizzbuzz.convert(input));
    }

    @ParameterizedTest(name = "{0} into {1}")
    @CsvSource({
            "5, Buzz",
            "10, Buzz",
            "20, Buzz"
    })
    public void convert_multiples_of_5_into_Buzz(int input, String output) {
        assertEquals(output, Fizzbuzz.convert(input));
    }

    @Test
    public void convert_15_into_FizzBuzz() {
        assertEquals("FizzBuzz", Fizzbuzz.convert(15));
    }

}