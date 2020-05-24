package com.tw.kang;

public class FizzBuzz {
    public String countOff(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
}
