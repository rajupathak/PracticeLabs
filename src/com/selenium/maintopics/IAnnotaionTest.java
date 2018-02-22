package com.selenium.maintopics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class IAnnotaionTest implements IAnnotationTransformer {
	
	@Override
	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2,
			Method methodname) {
		if(methodname.getName().equals("m1")){
			System.out.println("set data provider for " + methodname.getName()); 
			annotation.setDataProviderClass(DataProviderClass.class);
			
			annotation.setDataProvider("loginData");
		}
		
		else if(methodname.getName().equals("m2")){
			System.out.println("set data provider for " + methodname.getName()); 
			annotation.setDataProviderClass(DataProviderClass.class);
			
			annotation.setDataProvider("homeData");
		}
		
		else if(methodname.getName().equals("m3")){
			System.out.println("set data provider for " + methodname.getName()); 
			annotation.setDataProviderClass(DataProviderClass.class);
			
			annotation.setEnabled(false);
		}
	}

}
