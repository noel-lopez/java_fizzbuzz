package com.codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzShould {
    @Test
    public void convert_1_to_1() {
        assertEquals("1", Fizzbuzz.convert(1));
    }

    @Test
    public void convert_2_to_2() {
        assertEquals("2", Fizzbuzz.convert(2));
    }

    @Test
    public void convert_4_to_4() {
        assertEquals("4", Fizzbuzz.convert(4));
    }

}