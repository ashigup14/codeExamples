package com.test.ds;

public class Thread1 extends Thread {

	public Thread1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t= new Thread1();
		
		t.start();

	}

	@Override
	public void run() {
		System.out.println("hello");
		
	}

}


class Thread2 extends Thread {

	public Thread2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t= new Thread2();
		
		t.start();

	}

	@Override
	public void run() {
		System.out.println("hello");
		
	}

}
