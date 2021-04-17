package com.test.thread;

public class JoinExample {

	static boolean stop;

	public JoinExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		boolean b = true;
		
		Thread t = new Thread(){
			
			@Override
			public void run()
			{
				while(!stop)
				{
					System.out.println("print");
					System.out.println(b);
				}
			}
			
		};
		
		t.start();
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		
		stop = true;
		
		t.join();
		
		final int k = 1; 
		switch(10) { 
		case k:
			System.out.println("hello k");
		default:
			System.out.println("default");
		};
		}
	}
