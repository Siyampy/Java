package com.Logic;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						count++;
						break;
					}
					
				}
			}
			if(count==s1.length())
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}


	}

}
