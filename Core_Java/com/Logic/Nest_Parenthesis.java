package com.Logic;

import java.util.Scanner;

public class Nest_Parenthesis {
public static boolean nest(String s)
{
	int c = 0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='(')
		{
			c++;
		}
		else
		{
			if(s.charAt(i)==')')
			{
				c--;
				if(c<0)
				{
					return false;
				}
				
			}
		}
	}
	
	return (c==0);
	
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).nextLine();
		System.out.println(nest(s));
		

	}

}
