package com.samogit;

public class FizzBuzz {
    public static String fizzbuzz(int i) {
        if (i % 3 != 0 && i % 5 != 0) {
            return i + "";
        }

        String s = "";
        if (i % 3 == 0) {
            s += "Fizz";
        }
        if (i % 5 == 0) {
            s += "Buzz";
        }
        return s;
    }
}
