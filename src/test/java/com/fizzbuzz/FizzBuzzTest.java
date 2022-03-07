package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
    
    @Test
    public void test_number_divisor_3_and_5() {
        String result = FizzBuzz.getDivisors(6);
        String expecteds = "Fizz";
        assertEquals(result, expecteds);
    }

    @Test
    public void test_number_divisor_3() {  
        String result = FizzBuzz.getDivisors(10);
        String expecteds = "Buzz";
        assertEquals(result, expecteds);
    }

    @Test
    public void test_number_divisor_5() {
        String result = FizzBuzz.getDivisors(15);
        String expecteds = "FizzBuzz";
        assertEquals(result, expecteds);
    }

    @Test
    public void test_number_no_divisors() {
        String result = FizzBuzz.getDivisors(22);
        String expecteds = "22";
        assertEquals(result, expecteds);
    }

}
