package com.java.program;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringExapmle {
	public static void main(String[] args) {

		String infoMessage = "Java is Object Orianted programming Language and Java is Platfom Independent Java is more safe";

		String[] words = infoMessage.split(" ");

		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String word : words) {

			if (wordMap.containsKey(word.toLowerCase())) {

				wordMap.put(word.toLowerCase(),
						wordMap.get(word.toLowerCase()) + 1);
			} else {
				wordMap.put(word.toLowerCase(), 1);
			}
		}
		

		// Extracting all keys of wordmap

		Set<String> wordInString = wordMap.keySet();
		
		for(String wordKey:wordInString){
			if(wordMap.get(wordKey)>1){
				System.out.println(wordKey+" :"+ wordMap.get(wordKey));
			}
		}
		
		

	}

}
