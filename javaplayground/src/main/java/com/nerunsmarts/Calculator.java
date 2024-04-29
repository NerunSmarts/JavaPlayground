package com.nerunsmarts;

public class Calculator {

    public Calculator() {}

    public float add(int a, int b) {
        return a + b;
    }

    public float subtract(int a, int b) {
        return a - b;
    }

    public float multiply(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) throws Exception {
       if (b != 0) {
              return a / b;
         } else {
              throw new Exception("/ by zero");
       }
    }
}
