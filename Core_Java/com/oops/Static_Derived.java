package com.oops;

public class Static_Derived extends Static_Control_Flow  {

	static int x=200;
	static
	{
//		SOP(i)------------------> Direct read
//		We get CE illegal forward ref when var is just identified and not yet assigned the variable is said to be in RIWO state and not in Directread state
		
		m2();
		System.out.println("1 st Static Block Child");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		m2();
		System.out.println("Main Method Child");

	}
	public static void m2()
	{
//		SOP(i)------------------> InDirect read
		System.out.println(y);
	}
	static
	{
		m2();
		System.out.println("Second static child");
	}
	static int y=300;
	
//	hereonly the child main is only xecuted and hence method Hiding is done here

}
