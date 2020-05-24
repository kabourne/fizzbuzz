package com.tw.kang;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void given_num_is_multiple_of_3_when_countOff_then_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(3);
        assertThat(result, equalTo("Fizz"));
    }

    @Test
    public void given_num_is_multiple_of_5_when_countOff_then_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(5);
        assertThat(result, equalTo("Buzz"));
    }

    @Test
    public void given_num_is_multiple_of_7_when_countOff_then_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(7);
        assertThat(result, equalTo("Whizz"));
    }
}
