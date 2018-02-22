package com.java.program;

public class RepalceSubstringWithNewSubString {
	
	public static void replaceSubString(String str){
		String []str1=str.split(" ");
		String newString =" ";
//		for(String s :str1){
//			if(s.equals("bike")){
//				s.r
//				System.out.print(s);
//			}
//		}
	}
	
	
	
public static void main(String[] args) {
	replaceSubString("This bike is my bike");
	String s = "This bike is my bike";
	String b = s.replaceAll("bike", "car");
	System.out.println(b);
}
}
