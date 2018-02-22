package com.java.program;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {

	InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomExceptionExample {

	public void verifyAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("You are not eligible for this post");
		} else {
			System.out.println("Welcome to GD India");
		}
	}

	public static void main(String[] args) {
		CustomExceptionExample obj= new CustomExceptionExample();
		try{
			obj.verifyAge(15);
		}
		catch(Exception e){
			System.out.println("Exception Occured "+e);
		}
		System.out.println("Rest of the code");
	}
}
