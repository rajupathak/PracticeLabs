package com.java.program;

import java.util.Scanner;

public class ReverseStringWords {
public static void main(String[] args) {
	String originalString;
	String reverseString=" ";
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the String");
	
	originalString=input.nextLine();
	
	String arr[]=originalString.split(" ");
	for(int i=arr.length-1;i>=0;i--){
		reverseString=reverseString+arr[i]+" ";
	}
	System.out.println("Original String " +originalString );
	System.out.println("Revesre String " + reverseString);
}
}
