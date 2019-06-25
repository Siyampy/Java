package com.declarations_AccessModifiers;
abstract class A
{
	public abstract void m1();

}
class B extends A
{
	public void m1()
	{
		System.out.println("iam m1");
	}
}

public class Class_Modifiers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B b=new B();
		b.m1();
		

	}

}
