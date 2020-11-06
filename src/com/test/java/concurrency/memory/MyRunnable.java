/**
 * 
 */
package com.test.java.concurrency.memory;

/**
 * @author ashish
 *
 */
public class MyRunnable implements Runnable {

	private volatile int count = 0;
	
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
		synchronized(this) 
		{
			for(int i=0; i<1000000; i++)
			{
				this.count++;
			}
		
		
		System.out.println(
				Thread.currentThread().getName() + " : " + this.count);
		
		}
	}

}
