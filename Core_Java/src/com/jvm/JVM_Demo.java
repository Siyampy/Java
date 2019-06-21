package com.jvm;
import java.lang.reflect.Method;


public class JVM_Demo 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		long mb=1024*1024;
//		int count=0;
//		Class<?> c=Class.forName("java.lang.Object");
//		Method[] m=c.getDeclaredMethods();
//		for(Method m1:m)
//		{
//			count++;
//			System.out.println("Method "+m1.getName());
//		}
//		System.out.println("No of Methods"+count);
		Test t=new Test();
		Class c1=t.getClass();
		Test t2=new Test();
		Class c2=t2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1==c2);
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t==t2);
		System.out.println(JVM_Demo.class.getClassLoader());
		Runtime r=Runtime.getRuntime();
		System.out.println("Memory "+r.maxMemory()/mb);
		System.out.println("Memory "+(r.totalMemory()-r.freeMemory())/mb);
		System.out.println("Memory "+r.freeMemory());



		


		
		
		
	}
	
	

}
