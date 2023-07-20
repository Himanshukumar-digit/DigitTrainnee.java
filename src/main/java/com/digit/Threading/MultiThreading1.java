package com.digit.Threading;

import java.util.Scanner;

class Operation extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("banking")){
			banking();
	}
		else if((Thread.currentThread().getName().equals("printing"))){
			printing();
		}
		else {
			addition();
		}
		
	}
	void banking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking operation");
		System.out.println("Enter Account no:- ");
		int accn = sc.nextInt();
		System.out.println("Enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking completed");
	}
	void printing() {
		System.out.println("Printing operation");
		for(int i=1;i<=5;i++) {
			try {
			System.out.println("Hi Good Evening");
			Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing completed");
	}
	void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition operation");
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		int res = num1+num2;
		System.out.println("The result is: "+res);
		System.out.println("Addition Completed");
	}
	
}

public class MultiThreading1 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Operation op1=new Operation();
		op1.setName("banking");
		op1.setPriority(3);
		Operation op2=new Operation();
		op2.setName("printing");
		op2.setPriority(5);
		Operation op3=new Operation();
		op3.setName("addition");
		
		
		op1.start();
		op2.start();
		op3.start();
		System.out.println("Main TERMINATED");
		
		
		
	}

}
