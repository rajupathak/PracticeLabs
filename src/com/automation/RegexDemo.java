package com.automation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegexDemo {

	//public static final String REGULAR_EXPRESSION = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,12})";
	public static final String REGULAR_EXPRESSION="[a-zA-Z0-9]{6,8}";

	private Pattern pattern;
	private Matcher matcher;

	@Test
	public void PasswordValidator() {

		pattern = Pattern.compile(REGULAR_EXPRESSION);

		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		String Password = sc.next();

		matcher = pattern.matcher(Password);
		boolean b = matcher.matches();
		if (b) {
			System.out.println("Passwaord is valid!!!");
		} else {
			System.out.println("Invalid Password");
			RegexDemo use = new RegexDemo();

		}

	}

}
