package com.vikrant.ExceptionHandling;

/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 10, 2024
 *  time:11:46:52 PM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */
public class CustomRuntimeException extends RuntimeException{
	
	public CustomRuntimeException() {
		super();
		System.out.println("Custom runtime exception exception occured");
	}
	
	public CustomRuntimeException(String msg) {
		super(msg);
		System.out.println("Custom Runtime exception occured");
	}
	
	
}
