package com.digit.Threading;

class Gender extends Thread{
	public void run() {
		try {
	
		System.out.println(Thread.currentThread().getName() + " Entering the bathroom");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName() + " Is using the bathroom");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + " left the bathroom");
		Thread.sleep(6000);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	}
public class Disadvn_Mthread {
	public static void main(String[] args) throws InterruptedException {
		
	
	Gender g1 = new Gender();
	g1.setName("boy");

	Gender g2= new Gender();
	g2.setName("girl");

	Gender g3 = new Gender();
	g3.setName("others");
	g1.start();
	g1.join();
	g2.start();
	g2.join();
	g3.start();
	
	}
}
