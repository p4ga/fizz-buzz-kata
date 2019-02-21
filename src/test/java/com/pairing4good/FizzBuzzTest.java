package com.pairing4good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedNumberItReturnsThatNumber(){
        FizzBuzz billyBob = new FizzBuzz();

        assertEquals("1", billyBob.fizz(1));
    }
}
