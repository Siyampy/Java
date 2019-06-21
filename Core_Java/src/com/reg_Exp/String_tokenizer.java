package com.reg_Exp;

import java.util.StringTokenizer;

public class String_tokenizer 
{
	public static void main(String[] args)
	{
		// StringTokenizer---------java.util
		//Specially designed class for Tokenizing the String
		//StringTokenizer st=new StringTokenizer("Siyam Brothers Home");
		//When to divide acording to the specified token we shoud use as
	StringTokenizer st=new StringTokenizer("Siyam Brothers Home","\\.");

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}
