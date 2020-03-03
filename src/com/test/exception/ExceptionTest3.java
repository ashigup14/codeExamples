package com.test.exception;

import java.io.IOException;

public class ExceptionTest3 {

	public static void main(String[] args) {

			m();
		
			System.out.println("Code after exception caught ");
	}
	
	static void m()
	{
		try{
			m();
		}
		catch(StackOverflowError ex)
		{
			System.out.println("exception caught: " + ex);
		}
	}

}
