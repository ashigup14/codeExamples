package com.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomTypeAnnotation {

	public enum Priority{
		LOW, MEDIUM, HIGH
	}
	
	Priority priority() default Priority.MEDIUM;
	
	String[] tags() default "";
	
	String createdBy() default "Ashish";
	
	String lastModified() default "07/07/2020";
	
}
