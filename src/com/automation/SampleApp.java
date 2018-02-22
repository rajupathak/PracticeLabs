package com.automation;

public class SampleApp {
 static int i=-2;
  public void increament(){
	i= ++i;
  }
  public void decreament(){
	  i=--i;
  }
	public static void main(String[] args) {
		SampleApp app=new SampleApp();
		app.increament();
		app.decreament();
		SampleApp app1=new SampleApp();
		System.out.println(app1.i);
	}

}
