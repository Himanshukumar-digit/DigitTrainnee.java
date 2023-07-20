package com.digit.Threading;

import java.util.Scanner;

class banking extends Thread{
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
class printing extends Thread{
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
class addition extends Thread{
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

public class MultiThread02 {
	public static void main(String[] args) {
		banking b = new banking();
		b.start();
	   printing p = new printing();
		p.start();
		addition a = new addition();
		a.start();
		
	}

}
