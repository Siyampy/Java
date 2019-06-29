package com.enhancements_1_8_version;

public class Lambda_Multithreading {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Thread t=new Thread(()->
		{
			for(int i=0;i<10;i++)
				System.out.println("Child thread");
		});
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("Parent thread");
		
		

	}

}
