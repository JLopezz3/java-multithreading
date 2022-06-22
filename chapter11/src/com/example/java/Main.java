package com.example.java;

public class Main {

    //NonDaemonThread
    public static void main(String[] args) {
        new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("Expecting program shutdown now");
        System.exit(0);
        // must put exit or else thread will keep running
    }
}
