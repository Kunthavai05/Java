package com.java.demo;
import java.util.Scanner;
public class RevOrder {
	public static void main(String[] args) {
		
		Scanner name=new Scanner(System.in);
		System.out.println("enter the name:");
		
		String value = name.nextLine();


		StringBuffer m=new StringBuffer(value).reverse();
		
		
		
		System.out.println("enter the name in reverse order:"+m);
		
	
		
		
	}
 
	
}
