package com.protected_2;
import com.protected_1.*;
class B
{
	 void m2()
	{
		System.out.println("Hello");
	}
}
public class Protected_Members_2 extends Protected_Members_1
{
public static void main(String[] args) 
{
	B b=new B();
	b.m2();
//	Parent ref of the same class member
//	b.m1();//Invalid
	
//	By using only the child class ref the another package ref is been accesed
	Protected_Members_2 p2=new Protected_Members_2();
	p2.m1();
//	Protected_Members_1 p1=new Protected_Members_1();
//	p1.m1();
//	 Invalid and it requires the publix visibility
//	 Hence on the protected visibilit only the child classref is used to acces s the parent class methods from the another package onthe inheritance
	
	
	
}
}
