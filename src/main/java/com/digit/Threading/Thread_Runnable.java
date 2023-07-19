package com.digit.Threading;
import java.util.Scanner;

class banking1 implements Runnable{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking operation");
		System.out.println("Enter Account no:- ");
		int accn = sc.nextInt();
		System.out.println("Enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking completed");
	}
}
class printing1 implements Runnable{
	public void run() {
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
}
class addition1 implements Runnable{
	public void run() {
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

public class Thread_Runnable {
public static void main(String[] args) {
	System.out.println("Main started");
	banking b1 = new banking();
	Thread t1 = new Thread(b1);
	t1.start();
	printing p1 = new printing();
	Thread t2 = new Thread(p1);
	t2.start();
    addition a1 = new addition();
    Thread t3 = new Thread(a1);
	t3.start();
    System.out.println("Main terminated");
}
}
