package com.MultithreadingProducerConsumerProblem;

public class Program9 implements Runnable {
	public static void main(String[] args) {
		Program9 gp = new Program9();
		ThreadGroup g1 = new ThreadGroup("Group-1");
		Thread t1 = new Thread(g1,gp,"first thread");
		t1.start();
		Thread t2 = new Thread(g1,gp,"Second thread");
		t2.start();
		
		
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"----"+Thread.currentThread().getThreadGroup());
	}

}
