package com.cisc181.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.cisc181.core.Person;

public class PersonException extends Exception {
	final private String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	final private Pattern pattern = Pattern.compile(regex);

	/**
	 * Create an instance of the PersonException class, to be thrown
	 * to the caller
	 * 
	 * @param amount
	 */
	@SuppressWarnings("deprecation")
	public PersonException(Person person) {
		Matcher matcher = pattern.matcher(person.getPhone());
		if( person.getDOB().getYear()>100){
			System.out.println("PersonException: Person is too old.");
		}
		if (!matcher.matches()){
			System.out.println("PersonException: Person has the wrong phone number formate.");
		}
	}
}
