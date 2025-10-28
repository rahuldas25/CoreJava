package com.java.CoreJava.AllInThread.ProducerConsumerThread;

public class ProducerConsumerImpl {
    public static void main(String[] args) {
        SharedResource sharedBuffer=new SharedResource(3);

        // create producer using lambda expression
        Thread producerThread=new Thread(()->{
            try{
                for (int i=1;i<=6;i++){
                    sharedBuffer.produce(i);
                }
            } catch (Exception e) {

            }
        });

        // creating consumer using lambda expression

        Thread consumerThread=new Thread(()->{
            try{
                for(int i=1;i<=6;i++){
                    sharedBuffer.consume();
                }
            } catch (Exception e) {

            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
