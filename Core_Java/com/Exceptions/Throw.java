package com.Exceptions;

import java.util.Scanner;

public class Throw extends RuntimeException
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=0;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		if(i>20)
		{
			throw new Throw();
			//We cant throw the normal java classes and we can throw onlyn the Throwable type
//			Hence make the class extends the required Exception type and use the throw to getthe runtime exception
		}
		//Throw only the runtime exceptions not to throw thew Checked exception using the throws keyword
		
		//If we throw the Unchecked exception then we get the Runtime Error/Exception
		else
		{
			System.out.println("Success");
		}
		
//Example -----------Marriage age problems
	}

}
