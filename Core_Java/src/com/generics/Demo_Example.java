package com.generics;
//Simple Generics Class
class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob=ob; 
	}
	public void show()
	{
		System.out.println("Type of ob   "+ob.getClass().getName());
	}
	public T getOb()
	{
		return ob;
	}
}
//Creating object for this Generic class

public class Demo_Example 
{
	public static void main(String[] args) 
	{
		//Gen Object for String type
		Gen<String> g=new Gen<String>("Siyam");
		g.show();//Type of ob  java.lang.string
		System.out.println(g.getOb());
		
		//For Integer
		Gen<Integer> g1=new Gen<Integer>(1020);
		g1.show();//Type of ob  java.lang.string
		System.out.println(g1.getOb());
		//For Double
		Gen<Double> g2=new Gen<Double>(10.0);
		g2.show();//Type of ob  java.lang.string
		System.out.println(g2.getOb());
		
		
	}

}
