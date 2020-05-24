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
}
