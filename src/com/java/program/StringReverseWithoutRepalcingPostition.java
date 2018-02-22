package com.java.program;

public class StringReverseWithoutRepalcingPostition {
public static void main(String[] args) {
	String str="I love India";
	StringBuilder returnedStr = new StringBuilder();
	String [] words=str.split(" ");
	for (String s : words) {
		returnedStr.append(reverseString(s) + " ");
	}
	System.out.println(returnedStr);
}

public static StringBuilder reverseString(String s) {
	StringBuilder s1 = new StringBuilder(s);
	return s1.reverse();
}

}
