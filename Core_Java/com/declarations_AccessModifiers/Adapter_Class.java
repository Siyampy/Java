package com.declarations_AccessModifiers;
abstract class A1
{
	public void m1()
	{
		
	}
}
class B1 extends A1
{
	public void m1()
	{
		System.out.println("iam m1");
	}
}


public class Adapter_Class {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		Abstract class but not contain any abstrart methods
		B1 b=new B1();
		b.m1();

	}

}
