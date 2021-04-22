package com.test.exception;

import java.io.*;
//When child class method is throwing border checked exception compared to the same method of base class
public class Building4 {
		void color() throws IOException
		{
			  System.out.println("Blue");
		}  
	}
	class Room4 extends Building4{
		  void color() throws Exception
		  {
			  System.out.println("White");
		  }  
		  public static void main(String args[]){  
			  Building4 obj = new Room4();  
			   try{
			   obj.color();
			   }catch(Exception e){
				   System.out.println(e);
			   }
		  } 

