/**
 * 
 */
package com.test.java.concurrency.memory;

/**
 * @author ashish
 *
 */
public class SeperateObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyObject myObject = new MyObject();
		Runnable runnable1 = new MyRunnable(myObject);
		Runnable runnable2 = new MyRunnable(myObject);
		
		Thread t1 = new Thread(runnable1, "Thread 1");
		Thread t2 = new Thread(runnable2, "Thread 2");
		//Myobject is different even when we are using same MyRunnable object
		//Thread t2 = new Thread(runnable1, "Thread 2");
		
		t1.start();
		t2.start();
	}

}
