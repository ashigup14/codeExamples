package com.test.timerjob;

import java.util.Timer;
import java.util.TimerTask;

public class Test 
{ 
	private Timer timer;
	
    public static Test obj; 
    public static void main(String[] args) throws InterruptedException 
    { 
    	Test test = new Test();
        test.timerTest(); 
    }
    
	private void timerTest() throws InterruptedException {
		obj = new Test(); 
          
        // creating an instance of timer class 
        timer = new Timer(); 
          
        // creating an instance of task to be scheduled 
        TimerTask task = new Helper(); 
          
        // scheduling the timer instance 
        timer.schedule(task, 1000,3000); 
        
        TimerTask task1 = new Helper(); 
        
        timer = new Timer(); 
        
        // scheduling the timer instance 
        timer.schedule(task1, 1000,3000); 
        
        TimerTask task2 = new Helper(); 
        
        timer = new Timer(); 
        // scheduling the timer instance 
        timer.schedule(task2, 1000,3000);
          
        // fetching the scheduled execution time of  
        // the most recent actual execution of the task 
        System.out.println(task.scheduledExecutionTime()); 
          
        synchronized(obj) 
        { 
            //this thread waits until i reaches 4 
            obj.wait(); 
        } 
          
        //canceling the task assigned  
        System.out.println("Cancel the timer task: " + task.cancel()); 
          
        // at this point timer is still running  
        // without any task assigned to it 
      
        // canceling the timer instance created 
        timer.cancel();
	} 
} 
