package com.nerunsmarts;

public class CrashTest {
    public CrashTest() {}

    public void crash() {
        throw new RuntimeException("Excuse me, I need your help, you need to kill me."); // This will crash the program
    }
}
