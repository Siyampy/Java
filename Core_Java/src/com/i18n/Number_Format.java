package com.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class Number_Format 
{
	//To format a number
	//Present in java.text package
	public static void main(String[] args) 
	{
		//NumberFormat nf=new NumberFormat();
		// Since it is the abstract Class and it cant be instantiated
		// To rep the currencies,percentage 
		// So use 
		
		NumberFormat nf=NumberFormat.getInstance();
		//or 
		NumberFormat nf1=NumberFormat.getNumberInstance();
		// To get the normal number Indtance for java numbers
		
		
		NumberFormat nfc=NumberFormat.getCurrencyInstance();
		///To get the Currency Instance
		NumberFormat nfp=NumberFormat.getPercentInstance();
		//To get the precent Instance
		
		//To get to the Specific Locale pass the Locale wanted
		Locale l=Locale.getDefault();
		NumberFormat nf2=NumberFormat.getInstance();
		NumberFormat nfc1=NumberFormat.getCurrencyInstance();
		NumberFormat nfp1=NumberFormat.getPercentInstance();
		// To use the NumberFormat for the Given locale after getting NumberFormat Object
		String s=nfc1.format(20.0);
		System.out.println(s);
		//Number n=nf.parse(String s);
		//To convert the LocaleSpecificString form to the java Number Form
		   
		
		
		// To convert to the java number to the Country Specific Number form
		double d=123456.789;
		NumberFormat n=NumberFormat.getCurrencyInstance(Locale.US);
		//Use getCurrencyInstance() to get in the currency format
		
		n.setMaximumIntegerDigits(4);
		String ss=n.format(d);
		
		System.out.println("Italy  specific format :"+ss);
		
		//To set the number of the fractional digits we use
		//nf.setMaximumFractionDigits()
		//		//nf.setMinimumFractionDigits()
		//nf.setMaximumIntegerDigits()

		
		



		
		
	}

}
