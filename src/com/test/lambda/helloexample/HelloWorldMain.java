package com.test.lambda.helloexample;

public class HelloWorldMain {

	public static void main(String[] args) {

		String s ="I am Dhaani ";
		HelloWorld helloWorld = t->System.out.println( t +"Hello world!!");
		
		helloWorld.sayHello(s);

	}

}
