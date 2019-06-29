/**
 * 
 */
package com.enhancements_1_8_version;

/**
 * @author Siyam
 *
 */
interface A
{
	public void m1();
}
interface B
{
	public void m1(int a,int b);
}
interface C
{
	public void m1(int n);
	
}
public class Lambda_Exp 
{

	public static void main(String[] args)
	{
A a=()->System.out.println("Iam Lamda Expression");
a.m1();
//Using the Arguments
B b1=(a2,b2)->System.out.println(a2+b2);
b1.m1(10, 20);

C c1=nnn->System.out.println(nnn*nnn);
c1.m1(10);
//or
C c2=nnn->{System.out.println(nnn*nnn);};
c2.m1(999);



	}

}
