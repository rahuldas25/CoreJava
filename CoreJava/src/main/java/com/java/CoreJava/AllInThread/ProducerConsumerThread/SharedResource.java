package com.java.CoreJava.AllInThread.ProducerConsumerThread;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer=new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void produce(int item)throws Exception{
        //If Buffer is full, then wait for  the consumer to consume the items
        if (sharedBuffer.size()==bufferSize){
            System.out.println("full, wait for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("produce "+item);
        //Notify the consumer
        notify();
    }

    public synchronized int consume() throws Exception{
        // if Buffer is empty wait for the producer
        if(sharedBuffer.isEmpty()){
            System.out.println("Empty, wait for producer");
            wait();
        }
        int item=sharedBuffer.poll();
        System.out.println("Consumed "+item);
        notify();
        return item;
    }
}
