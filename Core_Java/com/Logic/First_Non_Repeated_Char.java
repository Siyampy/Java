package com.Logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class First_Non_Repeated_Char 
{
	public static void main(String[] args) 
	{
		String s="siamajlazmaies";
		Set<Character> r=new HashSet<>();
		List<Character> nr=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(r.contains(c))
			{
				continue;
			}
			if(nr.contains(c))
			{
				nr.remove((Character)c);
				r.add(c);
			}
			else
			{
				nr.add(c);
			}
		}
		System.out.println(nr.get(0));
	}

}
