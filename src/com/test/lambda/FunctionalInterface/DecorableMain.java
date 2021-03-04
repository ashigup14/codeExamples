package com.test.lambda.FunctionalInterface;

public class DecorableMain {
	 
    public static void main(String[] args) {
                // Using lambada expression
        Decorable dec=()->{System.out.println("Decorating with curtains");};
        dec.decorateWithCurtains();
    }
}
