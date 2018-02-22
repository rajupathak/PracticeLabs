package com.automation;

import java.util.Locale;

public class LocaleDemo {
	public static void main(String[] args) {
		Locale l1 = Locale.getDefault();
		System.out.println(l1.getCountry() + " " + l1.getLanguage());

		System.out.println(l1.getDisplayCountry() + " "
				+ l1.getDisplayLanguage());

		Locale l2 = new Locale("Hi", "In");

		System.out.println(l2.getCountry() + " " + l2.getLanguage());

		System.out.println(l2.getDisplayCountry() + " "
				+ l2.getDisplayLanguage());

		
		
		
	}
}
