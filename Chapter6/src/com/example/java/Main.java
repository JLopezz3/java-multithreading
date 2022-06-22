package com.example.java;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread();
        CalculatorRunnable runnable = new CalculatorRunnable(300000000L);

        Thread thread = new Thread(runnable);
        thread.setName("High Priority");
        thread.start();

        long startTime = System.currentTimeMillis();
        thread.join(5000);
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Join completed within: " + timeTaken + " for thread: " + Thread.currentThread().getName());

        System.exit(0);
    }
}
