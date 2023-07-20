package com.MultithreadingProducerConsumerProblem;

public class Queue {
	int x=0;
	public void get() {
		System.out.println("Consumer has consumed the value "+x);
	}
	public void put(int i) {
		x=i;
		System.out.println("Producer has produced the value "+x);
	}
	

}
