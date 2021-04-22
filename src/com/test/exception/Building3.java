package com.test.exception;
import java.io.*;

//When base class and child class both throws a checked exception
public class Building3 {
	   void color() throws IOException
	   {
	       System.out.println("Blue");
	   }  
	}
	class Room3 extends Building3{
	    void color() throws IOException
	    {
	        System.out.println("White");
	    }  
	    public static void main(String args[]){  
	    	Building3 obj = new Room3();  
	        try{
		   obj.color();
		}catch(Exception e){
		   System.out.println(e);
		 }
	    } 
	}