package com.test.thread;

class SampleThreadJoin extends Thread {
    private int processingCount = 0;
    private Thread predecessor;
    
    SampleThreadJoin(int processingCount, Thread thread) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
        this.predecessor = thread;
    }
 
    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " started");
        if(predecessor!= null)
			try {
				predecessor.join();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
        while (processingCount > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            	System.out.println("Thread " + this.getName() + " interrupted");
            }
            processingCount--;
        }
        System.out.println("Thread " + this.getName() + " exiting");
    }
}


