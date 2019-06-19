class A implements Cloneable
{
	int a;
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class Main implements Cloneable {
	public static void main(String ...a1)throws CloneNotSupportedException
	{
//		boolean b=true;
//		if(b=true)
//		{
//			System.out.println("Hello");
//		}
//		else
//		{
//			System.out.println("Not");
//		}
//		int b1=2;
//		int x=-10;
//		byte y=10;
//		System.out.println(x>>b1);
//		System.out.println(x>>>b1);
//		System.out.println(y>>b1);
//		System.out.println(y>>>b1);
		
A a11=new A();
A b=(A)a11.clone();
System.out.println(a11);
System.out.println(b);

	}

}
