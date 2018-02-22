package com.java.program;

public class PrimeNumber {
	int range = 100;
    int i;
    boolean isPrime;
	public void isprimeNumber() {
		
		for ( i = 2; i <= range; i++) {
			 isPrime = true;
			for (int j = 2; j <i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}
		
		
	}

	public static void main(String[] args) {
		PrimeNumber obj= new PrimeNumber();
		obj.isprimeNumber();
	}
}
