package com.test.exception;

import java.io.IOException;

public class ExceptionTest2 {

	static String resultString = "1";

	public static void main(String[] args) {

		ExceptionTest2 et2 = new ExceptionTest2();

		et2.m1();
		try {
			throw new IOException();
		} catch (Exception ex) {
			System.out.println("exception caught " + resultString);
		}
	}

	private void m1() {

		try {
			m2();
		} catch (Exception ex) {
			resultString += "2";
		}

	}

	private Exception m2() throws Exception {
		try {
			m3();
			resultString += "3";
		} catch (Exception ex) {
			resultString += "5";
			return ex ;
		} finally {
			resultString += "4";
		}

		m3();
		resultString += "3";
		return null;
	}

	private void m3() throws Exception {
		throw new Exception();
	}

}
