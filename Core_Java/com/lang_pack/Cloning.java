package com.lang_pack;


public class Cloning implements Cloneable
{
	int i=20;
	int j=30;

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		// TODO Auto-generated method stub
	Cloning t1=new Cloning();
		System.out.println(t1.hashCode());
		Cloning t2=(Cloning)t1.clone();
		System.out.println(t2.hashCode());
//		with cloning the hashcodes are not same for the objects
//		Types of cloning
//		Shallow Cloning----->Poining the intance reference to the same class.
//		default cloning by Objct classs clone()
//		Deep Cloning---------->Complete duplicate
//		Override for deep cloning
		System.out.println(t1.i);
		System.out.println(t1.j);
		t2.i=200;
		t2.j=300;
		System.out.println(t2.i);
		System.out.println(t2.j);
		


	}

}
