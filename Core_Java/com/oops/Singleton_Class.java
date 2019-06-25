package com.oops;

public class Singleton_Class {
private static Singleton_Class s=new Singleton_Class();
	public Singleton_Class() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton_Class getObject()
	{
		return s;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Singleton_Class s=Singleton_Class.getObject();
		Singleton_Class s1=Singleton_Class.getObject();

		Singleton_Class s2=Singleton_Class.getObject();

		Singleton_Class s3=Singleton_Class.getObject();

		Singleton_Class s4=Singleton_Class.getObject();

		Singleton_Class s5=Singleton_Class.getObject();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());


		

	}

}
