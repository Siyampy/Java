package com.Exceptions;

public class Throws {
	//Onl for Checked Exception but giveds the abnormal teerrminaton
//	Better to use the try catch()
	public static void main(String[] args)throws Exception 
	{
   m1();
		
	}
	//Throws keyword is only for the methodsand constructor not for te class
	
	public  static  void m1()throws Exception
	{
		Thread.sleep(2000);
		//We need to use throws for all methods in the call stack trace hence then the Exxeption is beeen delegates to the caller and finally too the JVM
		
	}

}
