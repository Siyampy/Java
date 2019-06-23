package com.Exceptions;

import java.io.IOException;
import java.io.PrintWriter;

public class Examples_Try_Catch
{
	public static void main(String[] args)
	{
		
		try
		{
		System.out.println("Hello");	
		}
		catch(ArithmeticException e)
		{
			
		}
		//Valid
		try
		{
		System.out.println("Hello");	
		}
		catch(Exception e)
		{
			
		}
		//Valid
//		try
//		{
//		System.out.println("Hello");	
//		}
//		catch(IOException e)
//		{
//			
//		}
//		Invalid
		// Here we get thhe unreachable code because here there is no
//		chance of raising Exception 
//		Hence catch block is not required 
//		Hence we get CE ;
		
		
		// Only for fully checked exception we need to compulsorily the exception to be raised in the try block 
//		Otherwise we get the C exception
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			Unreachable catch block for IOException. This exception is never thrown from the try statement body
//
//			at com.Exceptions.Examples_Try_Catch.main(Examples_Try_Catch.java:32)

		
		
//		The following case is valid when we use 
		try
		{
		
		PrintWriter p=new PrintWriter("");
		System.out.println("Hello");
		p.print("Hi");
		p.flush();
		p.close();
		}
		catch(IOException e)
		{
			System.out.println("handled the IOExeption");
		}
		//Same scnario is for the Interrupted Exception
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException i)
		{
			System.out.println("Handled Interrupted AException");
		}
		//Types of exceptions
//		JVm Exceptions
		
		
		
		
		
		//Raised automaticallly by JVM whenever weare trying to typecast paren tobject to chld type
		
//		Class Cast Exception
		//Stack OverflowError
		
		
//		NoClassDefFoundError-----------Raised when.class is not found by JVm
		//ExceptionInInitiaatorError
		
		
//		In Static variabke assignment
//		Programmer aException(Customized)
//		IllegalArgumentException
//		NumbrFormatException
//		IllegalStateException-----------Method invocedaat wrongtime
//		In thread ifecycle
////		API Devoloper
	
		
		//Asserton Error
		
//		assert(x>10)
//		Occurs when the asseetr Statement fails
	}

}
