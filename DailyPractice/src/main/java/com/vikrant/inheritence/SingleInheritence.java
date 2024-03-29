/**
 * Created for learning purpose.
 */
package com.vikrant.inheritence;

/**
 * @author ${Vikrant Kumar Chauhan}
 *
 *         ${{date:Mar 9, 2024};{time:7:45:34 PM};
 *         {package_name:DailyPractice;{$Thanks, Vikrant}
 */
public class SingleInheritence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InterestRate obj2 = new InterestRate();
		// For AXIS BANK
		obj2.setBank_name("AXIS BANK");
		obj2.setCountry("INDIA");
		obj2.display();

	}

}

class Bank {

	private String bank_name;
	private String country;

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

class InterestRate extends Bank {

	private double interest_rate;

	public double getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate() {
		if (getCountry() == "INDIA") {
			interest_rate = 8.1212d;
		} else if (getCountry() == "USA") {
			interest_rate = 7.34d;
		}
	}

	public void display() {
		System.out.println("Hi , Below are the bank details");
		System.out.println("Bank name is:" + getBank_name());
		System.out.println("Bank country is:" + getCountry());
		System.out.println("Bank interest rate is:" + getInterest_rate());
		System.out.println("Thanks");
	}

}
