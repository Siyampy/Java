package com.lang_pack;

class Cat
{
	int j;
	Cat(int i)
	{
		this.j=i;
		
	}
}
class Dog implements Cloneable
{
	int i;
	Cat c;
	Dog(Cat c,int i)
	{
		this.i=i;
		this.c=c;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
		
	}
}
public class Shallow_Cloning
{	
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Cat c=new Cat(20);
		Dog d=new Dog(c,10);
//		System.out.print();
		Dog d2=(Dog)d.clone();
		d2.i=34;
		d2.c.j=33;
		System.out.println(d2.i);
		System.out.println(d2.c.j);
		System.out.println(d.i);

		System.out.println(d.c.j);
		
	}

}
