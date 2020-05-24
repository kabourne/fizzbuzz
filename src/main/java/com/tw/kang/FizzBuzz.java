package com.tw.kang;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int num) {
        if (isMultipleOf(num, 3) && isMultipleOf(num, 5) && isMultipleOf(num, 7)) {
            return FIZZ + BUZZ + WHIZZ;
        }
        if (isMultipleOf(num, 3) && isMultipleOf(num, 5)) {
            return FIZZ + BUZZ;
        }
        if (isMultipleOf(num, 3) && isMultipleOf(num, 7)) {
            return FIZZ + WHIZZ;
        }
        if (isMultipleOf(num, 5) && isMultipleOf(num, 7)) {
            return BUZZ + WHIZZ;
        }
        if (isMultipleOf(num, 3)) {
            return FIZZ;
        }
        if (isMultipleOf(num, 5)) {
            return BUZZ;
        }
        if (isMultipleOf(num, 7)) {
            return WHIZZ;
        }
        return String.valueOf(num);
    }

    private boolean isMultipleOf(int num, int factor) {
        return num % factor == 0;
    }
}
