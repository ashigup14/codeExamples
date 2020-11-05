package com.test.timerjob;

import java.util.Timer; 
import java.util.TimerTask; 
  
class Helper extends TimerTask 
{ 
    public static int i = 0; 
    public void run() 
    { 
        System.out.println("Timer ran" + this.toString() + ++i); 
        if(i == 4) 
        { 
            synchronized(Test.obj) 
            { 
                Test.obj.notify(); 
            } 
        } 
    } 
      
}
