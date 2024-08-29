package com.template;

import java.util.ArrayList;
import java.util.List;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return a+b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a > b){
            return a;
        }
        else {
            return b;
        }

    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int result = 1;
        if (n!=0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        else {
            return 1;
        }
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        int total = input.length();
        return total;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String reversed = "";
        for (int i = input.length() -1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int min = 999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double farenheit = (celsius * 9/5) + 32;
        return farenheit;
    }
}
