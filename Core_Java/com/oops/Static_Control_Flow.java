package com.oops;

public class Static_Control_Flow 
{
//	Identification of the static Members from top to bottom
//	Execution of static variable assignments and static bock fro top to bottom
//	Excecution of the main method;.

	public Static_Control_Flow() 
	{
		// TODO Auto-generated constructor stub
	}
	static int i=20;
	static
	{
//		SOP(i)------------------> Direct read
//		We get CE illegal forward ref when var is just identified and not yet assigned the variable is said to be in RIWO state and not in Directread state
		
		m1();
		System.out.println("1 st Static Block");
	}
	public static void main(String[] args) 
	{
		m1();
		System.out.println("Main Method");
		
	}
	public static void m1()
	{
//		SOP(i)------------------> InDirect read
		System.out.println(j);
	}
	static
	{
		m1();
		System.out.println("Second static");
	}
	static int j=30;

}
