package com.pankaj.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Message> queue;

	public Producer(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Message m = new Message("" + i);
			try {
				queue.put(m);
				System.out.println("Produced " + m.getMsg());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// adding exit message
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
