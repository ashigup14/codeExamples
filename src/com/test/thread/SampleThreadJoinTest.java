package com.test.thread;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleThreadJoinTest {

	@Test
	public void givenStartedThread_whenJoinCalled_waitsTillCompletion() 
	  throws InterruptedException {
	    Thread t1 = new SampleThreadJoin(10,null);
	    t1.start();
	    Thread t2 = new SampleThreadJoin(2, t1);
	    t2.start();
	   	System.out.println("Invoking join");
	    t2.join();
	    System.out.println("Returned from join");
	    assertFalse(t1.isAlive());
	}

}
