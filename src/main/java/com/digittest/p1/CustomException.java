package com.digittest.p1;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getmessage() {
		return "Your age is less than 18,you are not eligible";
	}
}

class OverAgeException extends Exception{
	public String getmessage() {
		return "Your age is more than 60,you are not eligible";
	}
}

class Candidate{
	int age;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
	}
	void verify()throws Exception{
		if(age<18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getmessage());
			throw uae;
		}
		else if(age>60) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getmessage());
			throw oae;
		}
		else {
			System.out.println("Issue License");
		}
		
		
	}
}
class RTO{
	void grantLicense(Candidate c) {
		try {
			c.getData();
			c.verify();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
}



public class CustomException {
	public static void main(String[] args) {
		Candidate c1 = new Candidate();
		RTO rto = new RTO();
		rto.grantLicense(c1);
		
	}

}
