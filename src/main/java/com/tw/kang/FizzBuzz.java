package com.tw.kang;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int num) {
        List<String> results = new ArrayList<>();
        if (isMultipleOf(num, 3)) {
            results.add(FIZZ);
        }
        if (isMultipleOf(num, 5)) {
            results.add(BUZZ);
        }
        if (isMultipleOf(num, 7)) {
            results.add(WHIZZ);
        }

        if (!results.isEmpty()) {
            return String.join("", results);
        } else {
            return String.valueOf(num);
        }
    }

    private boolean isMultipleOf(int num, int factor) {
        return num % factor == 0;
    }
}
