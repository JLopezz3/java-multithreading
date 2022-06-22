package com.example.java;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        createJavaThread();
        createJavaFXThread();
        createAndroidThread();
        
    }

    private static void createJavaThread() {
        JavaThreadTest threadTest = new JavaThreadTest();

        Thread th = new Thread(threadTest);
        th.setName("JAVA_THREAD");

        th.start();

    }

    private static void createJavaFXThread() {
        JavaFXThreadTest threadTest = new JavaFXThreadTest();

        Thread th = new Thread(threadTest);
        th.setName("JAVAFX_THREAD");

        th.start();

    }

    private static void createAndroidThread() {
        AndroidThreadClass threadTest = new AndroidThreadClass();

        Thread th = new Thread(threadTest);
        th.setName("ANDROID_THREAD");

        th.start();

    }


}
