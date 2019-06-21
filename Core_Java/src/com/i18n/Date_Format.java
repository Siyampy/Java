package com.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Date_Format 
{

	public static void main(String[] args) 
	{
		//IN---------DD-MM-YYYY
		//US---------MM-DD-YYYY
		//So we need to convert the java date to the specific locale
		//Use DataFormat(Abstract class)
//DateFormat df=new DateFormat();// cant instantiate
		
		
		
//DateFormat d=DateFormat.getInstance();--------------------------
//DateFormat d=DateFormat.getTimeInstance();
//DateFormat d=DateFormat.getDateInstance();
//DateFormat d=DateFormat.getDateTimeInstance();
//DateFormat d=DateFormat.getDateInstance(style);
//DateFormat d=DateFormat.getTimeInstance(style);
//DateFormat d=DateFormat.getDateTimeInstance(dateStyle, timeStyle);
//DateFormat d=DateFormat.getDateTimeInstance(dateStyle, timeStyle, aLocale);  Get DateTime format for specific locale
//DateFormat d=DateFormat.getDateInstance(style, aLocale);  //Get Date format object for the specific locale
//DateFormat d=DateFormat.getTimeInstance(style, aLocale);
		
		
		// Styles are the way to display the date and time instance 
//		??Various styles Available are  
//		DateFormat.FULL---------0
//		DateFormat.LONG----------1
//		DateFormat.MEDIUM--------2
//		DateFormat.SHORT----------3
		
		
		
//		Java date form to the Locale Specific String Form
//		 d.format();
//		Locale Specific String to date
//		d.parse();
		
		//Examples
		
		//Get the DateFormat object for the 0,1,2,3 Styles
		System.out.println("Full Form  US-----------"+DateFormat.getDateInstance(0,Locale.US).format(new Date()));;
		System.out.println("Full Form  UK-----------"+DateFormat.getDateInstance(0,Locale.UK).format(new Date()));;
		System.out.println("Full Form  GERMANY-----------"+DateFormat.getDateInstance(0,Locale.GERMAN).format(new Date()));;
		System.out.println("Full Form  ITALY-----------"+DateFormat.getDateInstance(0,Locale.ITALY).format(new Date()));;
		System.out.println("LONG Form-----------"+DateFormat.getDateInstance(1,Locale.US).format(new Date()));;
		System.out.println("MEDIUM Form-----------"+DateFormat.getDateInstance(2,Locale.US).format(new Date()));;
		System.out.println("SHORT Form-----------"+DateFormat.getDateInstance(3,Locale.US).format(new Date()));;
		System.out.println("SHORT Form-----------"+DateFormat.getDateInstance().format(new Date()));;
		
//		To get both the date and the time
		System.out.println("Date and Time------"+DateFormat.getDateTimeInstance(0,0).format(new Date()));


		
	}
}
