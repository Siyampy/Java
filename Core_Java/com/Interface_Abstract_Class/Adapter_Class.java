package com.Interface_Abstract_Class;
interface A1
{
	public void m1();
	public void m2();
	public void m3();
	public void m4();
	public void m5();
	
	
	
}
class Aa1 implements A1
{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}
class Aa2 extends Aa1
{
	public void m1()
	{
		System.out.println("Hello");
	}
}

public class Adapter_Class extends Aa2 {

	public Adapter_Class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//if using i/GF we need to provide the ipementation fora the ,metids i n the implemntedclass 
//		But by udng Adapter class we can redstrict it
		new Aa2().m1();

	}

}
