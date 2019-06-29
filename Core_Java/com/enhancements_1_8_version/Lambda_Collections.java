package com.enhancements_1_8_version;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	String name;
	int no;
	public Employee(String name, int no)
	{
		
		this.name = name;
		this.no = no;
	}
	public String toString()
	{
		return no+":"+name;
	}

	}
	


public class Lambda_Collections {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Siyam", 20));
		l.add(new Employee("Sagoo", 10));

		l.add(new Employee("Siva", 15));

		l.add(new Employee("Sagii", 21));

		l.add(new Employee("Saroo", 22));
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.no<e2.no)?-1:(e1.no>e2.no)?1:0);
		System.out.println(l);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);


		

	}

}
