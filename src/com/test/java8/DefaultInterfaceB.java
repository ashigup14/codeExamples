package com.test.java8;

public interface DefaultInterfaceB{
	default void printData(String data)
	{
		System.out.println("printed Data::" + data);
	}
	
	static void getAddResult(int a, int b)
	{
		System.out.println("sum =" + ( a + b));
	}
}
