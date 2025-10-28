package com.java.CoreJava.AllInThread.DemonThread;

/* A deadlock in Java threads occurs when two or more threads are permanently blocked,
each waiting for a resource held by the other,
causing the program to hang indefinitely
 */
public class DemonImpl {
    public static void main(String[] args) {
        Object lock1=new Object();
        Object lock2=new Object();

        Thread t1=new Thread(()->{
            synchronized (lock1){
                System.out.println("Thread 1: Holding lock1....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1: Waiting for Lock 2...");
                synchronized (lock2){
                    System.out.println("Thread 1: Acquired Lock 2.....");
                }
            }
            System.out.println("stop");
        });

        Thread t2=new Thread(()->{
            synchronized (lock2){
                System.out.println("Thread 2: Holding lock 2...");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2: waiting for lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2: Acquired Lock 1");
                }
            }
            System.out.println("stop");
        });

        t1.start();
        t2.start();
    }

}
