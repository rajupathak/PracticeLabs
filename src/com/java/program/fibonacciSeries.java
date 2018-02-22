package com.java.program;

public class fibonacciSeries {
public static void main(String[] args) {
	int previousNumber=0;
	int nextNumber=1;
	int sum=previousNumber+nextNumber;
	for(int i=1;i<=10;i++){
		System.out.println(sum);
		previousNumber=nextNumber;
		nextNumber=sum;
		sum=previousNumber+nextNumber;
		
	}
}
}
