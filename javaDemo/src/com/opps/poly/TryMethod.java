package com.opps.poly;

public class TryMethod {
	
	public static void main(String[] args) {
		
		try
		{
			int num=50/0;
		}
		catch(ArithmeticException a)
		{
		System.out.println(a);	
		}
		finally
		{
			System.out.println("enter the exception");
			
		}
		System.out.println("corect");
	}

}
