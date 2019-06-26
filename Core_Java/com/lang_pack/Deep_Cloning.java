package com.lang_pack;

class Cat1
{
	int j;
	Cat1(int i)
	{
		this.j=i;
		
	}
}
class Dog1 implements Cloneable
{
	int i;
	Cat1 c;
	Dog1(Cat1 c,int i)
	{
		this.i=i;
		this.c=c;
	}
	public Object clone()throws CloneNotSupportedException
	{
		//return super.clone();
		Cat1 c2=new Cat1(c.j);
		Dog1 d2= new Dog1(c2,i);
		return d2;
		
	}
}
public class Deep_Cloning 
{
public static void main(String[] args)throws CloneNotSupportedException
{
	Cat1 c=new Cat1(20);
	Dog1 d=new Dog1(c,10);
//	System.out.print();
	Dog1 d2=(Dog1)d.clone();
	d2.i=34;
	d2.c.j=33;
	System.out.println(d2.i);
	System.out.println(d2.c.j);
	System.out.println(d.i);

	System.out.println(d.c.j);
	
}
}
