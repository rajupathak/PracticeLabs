package com.java.program;

public class ContinueExapmle {
	public static void main(String[] args) {

		//Continue Statement is used inside the loop
		
		for(int counter=1;counter<=10;counter++){
			
		//If we don't want to execute the below statement for some specific condition then will use continue	
			
			if(counter==5){
				
				
				continue;
			}
			
			
			
			System.out.println(counter+"Java");
		}
		
		
		
		
		
		
		
		// switch statement

		int input = 10;
		switch (input) {
		case 12:
			System.out.println("A");
			break;
		case 14:
			System.out.println("B");
			break;

		case 13:
			System.out.println("c");
			break;
		default:
			System.out.println("D");
		}

	//Do While Example;	
		
		int i=1;
			do{
				System.out.println(i);
				i++;
			}
			while(i<=5);
				
			
		}
		
		
		
	}

