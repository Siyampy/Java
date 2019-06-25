package com.protected_1;



//Protcted------------Default+Child Class
//with parent referebnce we aaccess the  child in same package
//But with only the child ref the outside package is been accessed
class A
{
	protected void m1()
	{
		System.out.println("Hi");
	}

}

public class Protected_Members_1 extends A
{
	protected void m1()
	{
		System.out.println("Hi Hello");
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A a=new A();
		a.m1();
		A a1=new Protected_Members_1();
		a1.m1();
		Protected_Members_1 p=new Protected_Members_1();
		p.m1();

	}

}
