package com.Logic;

public class Pattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(k+"");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(k+"");
			}
			System.out.println("");
		}

	}

}
