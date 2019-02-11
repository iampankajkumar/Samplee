package com.pankaj.thread.blockingqueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

private BlockingQueue<Message> queue;
    
    public Consumer(BlockingQueue<Message> q){
        this.queue=q;
    }

    @Override
    public void run() {
        try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getMsg() !="exit"){
            System.out.println("Consumed "+msg.getMsg());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}