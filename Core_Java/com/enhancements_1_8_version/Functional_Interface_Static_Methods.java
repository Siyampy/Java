package com.enhancements_1_8_version;
interface Aa2
{
	static void m1()
	{
		System.out.println("Iam Default method Aa2");
	}
}
interface Ab1
{
//	public static void main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//		// Can also contain Main() method in interface
//
//	}
	static void m1()
	{
		System.out.println("Iam Default method Ab");
	}
	
}

public class Functional_Interface_Static_Methods implements Aa2{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Aa2.m1();
//		 Only by the interface name with . operator  then only the static metods can  be called even it is the normal class or the implementtion class.
//		m1();
		

	}

}
