package com.test.java8;

public class DefaultandStaticInterfaceExample implements DefaultInterfaceA, DefaultInterfaceB {

	public DefaultandStaticInterfaceExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultInterfaceA.getAddResult(10, 20);
	}

	@Override
	public void printData(String data) {
		// TODO Auto-generated method stub
		DefaultInterfaceA.super.printData(data);
	}
	
	static void getAddResult(int a, int b)
	{
		System.out.println("sum =" +  (a+b));
	}
	

}
