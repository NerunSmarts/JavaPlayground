package com.nerunsmarts;

public class Calculator {

    public Calculator() {}

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws Exception {
       if (b != 0) {
              return a / b;
         } else {
              throw new Exception("/ by zero");
       }
    }
}
