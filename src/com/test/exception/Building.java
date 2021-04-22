package com.test.exception;

// If base class doesn’t throw any exception but child class throws an unchecked exception.
public class Building {  
	   void color()
	   {
	       System.out.println("Blue");
	   }  
	}

class Room extends Building{
	   //It throws an unchecked exception
	   void color() throws NullPointerException
	   {
	       System.out.println("White");
	   }  
	   public static void main(String args[]){  
	       Building obj = new Room();  
	       obj.color(); 
	   } 
	}
