package com.automation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeHelperLogic {

	public static String getCurrentDateTime() {

		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());

		return dateTime;
	}
	
	public static String getcurrentDate(){
		
		String currentData=getCurrentDateTime().substring(0, 10);
		
		return currentData;
	}
	
	public static void main(String[] args) {
		System.out.println(getCurrentDateTime());
		
		
		System.out.println(getcurrentDate());
	}

}
