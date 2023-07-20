package com.digit.Threading;

import java.util.Scanner;

class MSOffice extends Thread {

	public void run() {

		if (Thread.currentThread().getName().equals("Typing")) {

			typing();

		} else if (Thread.currentThread().getName().equals("Checking")) {

			checking();

		} else {

			saving();

		}

	}

	void typing() {

		for (int i = 0; i < 5; i++) {

			try {

				System.out.println("Typing....");

				Thread.sleep(2000);

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

	void checking() {

		for (;;) {

			try {

				System.out.println("Checking....");

				Thread.sleep(2000);

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

	void saving() {

		for (;;) {

			try {

				System.out.println("Saving....");

				Thread.sleep(2000);

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}

public class Thread_Runn {
	public static void main(String[] args) {

		System.out.println("Start");

		MSOffice ms = new MSOffice();

		ms.setName("Typing");

		MSOffice ms1 = new MSOffice();

		ms1.setName("Checking");
		ms1.setDaemon(true);
		ms1.setPriority(8);

		MSOffice ms2 = new MSOffice();

		ms2.setName("Saving");
		ms2.setDaemon(true);
		ms2.setPriority(8);

		ms.start();

		ms1.start();

		ms2.start();

	}
}
