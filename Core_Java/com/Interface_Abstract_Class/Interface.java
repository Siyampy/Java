package com.Interface_Abstract_Class;

interface A
{
	public void m1();
}
interface B extends A
{
	public void m1();
}
public class Interface implements B
{

	// methods are alwaus pblic and abstract by default
//	Variables are public astatic and final
//	If Interface naming conflict occur prefix ythre method eith the i.F name
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
