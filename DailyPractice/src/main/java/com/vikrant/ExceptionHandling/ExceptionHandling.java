package com.vikrant.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Vikrant Kumar Chauhan date:Mar 10, 2024 time:11:46:24 PM
 *         package_name:DailyPractice Thanks, Vikrant
 */
public class ExceptionHandling {

	// Throws : for checked(compiled exception)
	// throw : for unchecked exception(runtime)

	public static void main(String[] args) {

		try {
			System.out.println("Calling file reader");
			fileReader();
			System.out.println("Exception occured so not printing");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			try {
				customExcep("vik");
			}catch(CustomRuntimeException c) { //caling inside try
				c.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("After file reading");
	}

	public static void fileReader() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("a.png");
	}

	public static void customExcep(String s) {
		if (s.equalsIgnoreCase("Vik")) {
			throw new CustomRuntimeException("Hi From custom exceptio");
		} else {
			System.out.println("No exception occured");
		}
		System.out.println("After handling exception");
	}

}
