package com.java.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExamples {
public static void main(String[] args) {
	try{
		
		FileReader fread= new FileReader("ABC.txt");
		BufferedReader br= new BufferedReader(fread);
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line +"\n");
		}
		br.close();
	}
	catch(IOException e){
		System.out.println("File Not Found");
	}
}
}
