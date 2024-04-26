package com.nerunsmarts;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
             System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println(Math.sqrt(-1));
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        Calculator calculator = new Calculator();
        try {
            System.out.println("1 + 2 = " + calculator.divide(1, 0));
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}