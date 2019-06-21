package com.i18n;
//Internationalization

import java.util.Locale;

//the process of designing web applications in such a way 
//that wich provides a support for various countries and languages and various currencies automatically withot performing any change in the application, is called Internationalization
//


//Locale
//NumberFormat
//DateFormat

//Locale represents the Geographic Location(Country or Language or both)
public class I18N
{
	public static void main(String[] args)
	{
		//Locale
		//Final class i java.util
//		Locale l=new Locale(String lang );
//		Locale l=new Locale(String lang,String country );
//		Locale l=Locale.ENGLISH;
//		Use these Constants instead of the Constructors
//		System.out.println(Locale.getDefault());
		//Methods in Locale 
		//Static
		//locale.getDefault();
		//Locale.setDefault(Locale l);
		
		//Normal methods
		//Locale Objct.
		//getLanguage();
		//getDisplayLanguage()
		//getCountry()
		//getDisplayCountry()
		
		//To get all countriies,languages ,Locales supported by jvm
		//getISOLanguages()------------returns String[]
		//getISOCountries()------------returns String[]
		//getAvaiableLocales()------------returns Locale[]
		
		
		//Examples
		Locale l=Locale.getDefault();
		System.out.println(l.getLanguage()+"---------------"+l.getCountry()+"---------"+l.getDisplayCountry()+"----------"+l.getDisplayLanguage());
		Locale.setDefault(new Locale("pa","IN"));
		Locale l1=Locale.getDefault();
		System.out.println(l1.getLanguage()+"---------------"+l1.getCountry()+"---------"+l1.getDisplayCountry()+"-----------"+l.getDisplayCountry());
		
         String[] ss=Locale.getISOLanguages();
         for(String s:ss)
         {
        	 System.out.println(s);
         }
         
         String[] ss1=Locale.getISOCountries();
         for(String s:ss1)
         {
        	 System.out.println(s);
         }
         Locale[] ss2=Locale.getAvailableLocales();
         for(Locale s:ss2)
         {
        	 System.out.println(s.getLanguage()+"---------------"+s.getCountry()+"---------"+s.getDisplayCountry()+"----------"+s.getDisplayLanguage());
         }
		
		
	}

}
