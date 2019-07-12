package com.Logic;

public class String_permutation 
{
public static void permute(String s,int l,int r)
{
	
	if(l==r)
	{
		System.out.println(s);
	}
	else
	{
		for(int i=l;i<=r;i++)
		{
			s=swap(s,l,i);
			permute(s,l+1,r);
			s=swap(s,l,i);//Backtracking 
			
		}
		
		
	}
	
}
public static String swap(String s,int i,int j) 
{
	char [] s1=s.toCharArray();
	char temp=s1[i];
	s1[i]=s1[j];
	s1[j]=temp;
	return String.valueOf(s1);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="ABCDEF";
		permute(s,0,s.length()-1);

	}

}
