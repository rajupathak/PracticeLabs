package com.java.program;

import java.util.Scanner;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {

		int index;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the index");
		index = input.nextInt();
		System.out.print("0 1 ");
		fibo(0,1,index,2);
	}
	
	public static void fibo(int n1,int n2,int index,int count){
		int newNumber;
		if(count<=index){
			newNumber=n1+n2;
			System.out.print(newNumber+" ");
			fibo(n2,newNumber,index,count+1);
		}
	}
}
