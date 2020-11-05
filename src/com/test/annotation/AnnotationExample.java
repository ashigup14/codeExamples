/**
 * 
 */
package com.test.annotation;

/**
 * @author ashish
 *
 */
@CustomTypeAnnotation(
		priority = CustomTypeAnnotation.Priority.HIGH,
		createdBy = "Nupur",
		tags = {"java" , "annotations"}
		)
public class AnnotationExample {

	@CustomMethodAnnotation
	void shouldAlwaysBeProcessed()
	{
		System.out.println("This should always be processed!!");
	}
	
	@CustomMethodAnnotation
	void willThrowException()
	{
		throw new RuntimeException("This will throw exception!!");
	}
	
	@CustomMethodAnnotation
	void shouldNotBeProcessed()
	{
		throw new RuntimeException("This should never be processed!!");
	}

}
