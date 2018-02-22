package com.java.program;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String originalString;
		String reverseString=" ";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the String");
		
		originalString=input.nextLine();
		
		int length=originalString.length();
		for(int i=length-1;i>=0;i--){
			reverseString=reverseString+ originalString.charAt(i);
		}
		System.out.println("Original String " +originalString );
		System.out.println("Revesre String " + reverseString);
	}
}
