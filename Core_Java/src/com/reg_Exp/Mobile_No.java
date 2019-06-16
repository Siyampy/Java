package com.reg_Exp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_No 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Pattern p=Pattern.compile("(0/91)?9[6-9][0-9]{9}");
	Matcher m=p.matcher(s);
	if(m.find()&&m.group().equals(s))
	{
		System.out.println("Valid Mobile No");
	}
	else
	{
		System.out.println("Invalid");
	}
}
}
