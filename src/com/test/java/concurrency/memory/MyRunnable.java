/**
 * 
 */
package com.test.java.concurrency.memory;

/**
 * @author ashish
 *
 */
public class MyRunnable implements Runnable {

	private int count = 0;
	
	private MyObject myObject = null;
	
	
	public MyRunnable(){}
	
	public MyRunnable(MyObject myObject){
		this.myObject = myObject;
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
	//	MyObject myObject = new MyObject();
		System.out.println(myObject);
		for(int i=0; i<100; i++)
		{
			this.count++;
		}
		
		System.out.println(
				Thread.currentThread().getName() + " : " + this.count);
	}

}
