package com.pairing4good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedOneItReturnsOne() {
        FizzBuzz billyBob = new FizzBuzz();
        assertEquals("1", billyBob.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedTwoItReturnsTwo() {
        FizzBuzz billyBob = new FizzBuzz();
        assertEquals("2", billyBob.fizz(2));
    }

    @Test
    public void whenFizzBuzzIsPassedThreeItReturnsFizz() {
        FizzBuzz billyBob = new FizzBuzz();
        assertEquals("fizz", billyBob.fizz(3));
    }

    @Test
    public void whenFizzBuzzIsPassedSixItReturnsFizz() {
        FizzBuzz billyBob = new FizzBuzz();
        assertEquals("fizz", billyBob.fizz(6));
    }
}

