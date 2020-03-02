package com.test.exception;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		try{
			throw new IOException();
		}
		catch(Exception ex)
		{
			System.out.println("exception caught " + ex);
		}
	}

}
