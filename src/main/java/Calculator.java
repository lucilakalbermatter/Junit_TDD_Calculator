package main.java;

public class Calculator {

    public int addition(int a, int b) {
       return a + b;
    }

    public int subtract(int a, int b) {
       return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Cannot division by zero");
        } else {
            return a / b;
        }
    }
}

