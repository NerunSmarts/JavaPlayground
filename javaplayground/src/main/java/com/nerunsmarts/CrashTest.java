package com.nerunsmarts;
import java.util.Scanner;

public class CrashTest {
    public CrashTest() {}

    public void crash() {
        throw new RuntimeException("Excuse me, I need your help, you need to kill me."); // This will crash the program
    }
    public void calculatorTest() {
        int numA;
        int numB;
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        boolean isFinished = false;
        while (!isFinished) {
            numA = 0;
            numB = 0;
            while (isRunning) {
                System.out.println("Enter a dividend: ");
                try{
                    numA = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    isRunning = false;
                    break;
                }
                System.out.println("Enter a divisor: ");
                try {
                    numB = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    isRunning = false;
                    break;
                }
                if (numA == -1 && numB == -1) {
                    System.out.println("Exiting...");
                    isFinished = true;
                    break;
                } else {
                    try {
                        System.out.println("The result is: " + calculator.divide(numA, numB));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }

    }
}
