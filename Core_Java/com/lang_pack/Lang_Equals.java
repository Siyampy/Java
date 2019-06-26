package com.lang_pack;
class S
{
	int rno;
	String name;
	public S(int r,String s)
	{
		this.rno=r;
		this.name=s;
	}
	public boolean equals(Object o)
	{
		String s1=this.name;
		int r=this.rno;
		S s=(S)o;
		String s2=s.name;
		int r2=s.rno;
		if(s1.equals(s2)&&(r==r2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	//Even we can simplify it 
}

public class Lang_Equals {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		S s1=new S(1,"Siyam");
		S s2=new S(1,"Siyam");
		System.out.println(s1.equals("Siyam"));//Object class return false but our class equals gives ClassCastException
		
		

	}

}
