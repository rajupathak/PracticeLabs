package com.java.program;

public class OverridindTest {
	 public void m1(int...x)
	{
		System.out.println("m1..");
	}
public static void main(String[] args) {
	OverridindTest o = new Test();
	Test t = new Test();
	   t.m1(10);
		o.m1();
	}
	
}
 class Test extends OverridindTest{
	 public  void  m1(int...x)
	{
		System.out.println("m1 from Test..");
	}
	
	
}