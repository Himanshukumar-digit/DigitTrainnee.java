package com.digit.Threading;

import java.util.Scanner;

public class MultiThreading {
	public static void main(String[] args) throws InterruptedException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking operation");
		System.out.println("Enter Account no:- ");
		int accn = sc.nextInt();
		System.out.println("Enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking completed");
		
		System.out.println("Printing operation");
		for(int i=1;i<=5;i++) {
			System.out.println("Hi Good Evening");
			Thread.sleep(2000);
		}
		System.out.println("Printing completed");
		
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
