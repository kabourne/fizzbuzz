package com.tw.kang;

public class FizzBuzz {
    public String countOff(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        if (num % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(num);
    }
}
