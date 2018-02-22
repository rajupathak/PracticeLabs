package com.java.program;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} 
		catch(Exception e){
			System.out.println("AA");
		}
		
		catch (Throwable ex) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		throw new Error(); /* Line 22 */
	}
}
