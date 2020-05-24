package com.tw.kang;

public class FizzBuzz {
    public String countOff(int num) {
        if (isMultipleOf(num, 3)) {
            return "Fizz";
        }
        if (isMultipleOf(num, 5)) {
            return "Buzz";
        }
        if (isMultipleOf(num, 7)) {
            return "Whizz";
        }
        return String.valueOf(num);
    }

    private boolean isMultipleOf(int num, int factor) {
        return num % factor == 0;
    }
}
