package com.example.java;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread th = Thread.currentThread();

        System.out.println("Current Thread: " + th.getName());

        th.setName("MyThread");

        System.out.println("Current Thread: " + th.getName());

        Thread.sleep(100000);
    }
}
