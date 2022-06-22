package com.example.java;

public class DaemonThread {

    //Java offer 2 types of thread: user thread and daemon thread.
    //All of the threads we used in the previous chapters are user threads.
    //User threads are high-priority threads. The JVM will wait for any user thread to complete its task before terminating it.
    //
    //So what is daemon thread?
    //Daemon threads are low-priority threads that does not prevent JVM from exiting when the program finishes but the thread
    //is still running.  In other words, The JVM exits when the only threads running are all daemon threads.
    //For example: a daemon thread is the garbage collection.
    //
    //* Note:
    //    1. Daemon threads are not recommended for I/O tasks
    //    2. Do not call join() method for daemon threads

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            System.out.println("Am I Daemon: " + Thread.currentThread().isDaemon());
            while(true){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        th.setDaemon(true);
        th.start();

        System.out.println("Expecting program shutdown now");
        Thread.sleep(500);
    }
}
