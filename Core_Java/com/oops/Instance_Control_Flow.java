package com.oops;
class A
{
	int i1=2;
	{
		m2();
		System.out.println("First Instance block   ");
	}
	public void m2()
	{
		System.out.println(j1);
	}
	public static void main(String[] args) {
		
		new Instance_Control_Flow();
		System.out.println("MAin");
	}

	public A() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Cons");
	}
	{
		System.out.println("Second Instance block   ");

		
	}
int j1=3;
	
}

public class Instance_Control_Flow extends A
{
	int i=2;
	{
		m1();
		System.out.println("First Instance block child   ");
	}
	public void m1()
	{
		System.out.println(""+j);
	}
	public static void main(String[] args) {
		
		new Instance_Control_Flow();
		System.out.println("MAin child");
	}

	public Instance_Control_Flow() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Cons child");
	}
	{
		System.out.println("Second Instance block child  ");

		
	}
int j=3;
}
