package com.java.program;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteExapmle {
public static void main(String[] args) {
	try{
		
		FileWriter file= new FileWriter("ABC.txt");
		PrintWriter pobj= new PrintWriter(file);
		pobj.println("Hi Welcome to Java");
		pobj.println("Learn Selenium");
		pobj.close();
		
	}
	catch(IOException e){
		System.out.println(e.getMessage());
	}
}
}
