/**
 * 
 */
package com.test.annotation;

/**
 * @author Ashish Gupta
 *
 */
public @interface MyAnnotation {

	String name() default "rahul";
	int count() default 100;
}
