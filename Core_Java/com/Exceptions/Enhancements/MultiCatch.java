package com.Exceptions.Enhancements;

public class MultiCatch
{
public static void main(String[] args) 
{
	try
	{
//		String s=null;
		String s="HIIII11111";
		if(s.length()>6)
		{
			System.out.println(10/0);
		}
	}
	catch(NullPointerException|ArithmeticException e)
	{
		System.out.println("Excepton Occured "+e);
		//In multicatch blocks theere shuld not be any relaton between the exception types ie chils to parent or parent to chid or same type Otherwise we gerrrt CRE
	}
	//Rethrowing exception
	
	
	try
	{
		System.out.println(10/0);
		
	}
	catch(ArithmeticException e)
	{
//		throw new ExceptionInInitializerError();
		throw new ClassCastException();
		
	}
	
}
}
