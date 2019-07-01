package com.enhancements_1_8_version;

interface Aa
{
	default void m1()
	{
		System.out.println("Iam Default method Aa");
	}
}
interface Ab
{
	default void m1()
	{
		System.out.println("Iam Default method Ab");
	}
	
}
public class Functional_Interface implements Aa,Ab
{
	public void m1()
	{
//		System.out.println("Iam Default method");
		Aa.super.m1();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Aa a=new Aa()
		{
			public void m1()
			{
				System.out.println("Default method implementation");
			}
		};
		a.m1();
		new Functional_Interface().m1();

	}

}
