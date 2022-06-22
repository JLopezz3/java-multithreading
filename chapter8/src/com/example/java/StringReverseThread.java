package com.example.java;

import java.util.List;

public class StringReverseThread extends Thread {

    private List<Character> names;
    private String message;

    public StringReverseThread(List<Character> names, String message) {
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (names){
            System.out.println("'Names' aquired by " + Thread.currentThread().getName());
            for (int i = 0; i < message.length(); i++) {
                try {
                    //HELLO =-> H, E, L, L, O
                    names.add(message.charAt(i));
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(names);
        }
    }

}
