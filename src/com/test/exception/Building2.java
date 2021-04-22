package com.test.exception;


import java.io.*;
//If base class doesn’t throw any exception but child class throws an checked exception
public class Building2 { 
	   void color()
	   {
	      System.out.println("Blue");
	   }  
	}

class Room2 extends Building2{
	   void color() throws IOException
	   {
	      System.out.println("White");
	   }  
	   public static void main(String args[]){  
	      Building2 obj = new Room2();  
	      try{
	         obj.color();
	      }catch(Exception e){
	         System.out.println(e);
	       }
	   } 
	}
