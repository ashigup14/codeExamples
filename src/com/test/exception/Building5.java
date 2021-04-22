package com.test.exception;

import java.io.IOException;

//When child class method is throwing checked exception compared to the same method of base class
public class Building5 {

	void color() {
		System.out.println("Blue");
	}
	public static void main(String args[]) {
		Building5 obj = new Room5();
		try {
			obj.color();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Room5 extends Building5 {

	public Room5()
	{
		super();
		try{
			System.out.println("helloWorld");
		}
		catch(Exception e)
		{
			System.out.println("in exception");
			
		}
	}
	
	@Override
	void color()  throws NullPointerException {
		System.out.println("White");
	}

}