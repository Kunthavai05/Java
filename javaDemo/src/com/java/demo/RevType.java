package com.java.demo;
import java.util.Scanner;
public class RevType {
	
	public static void main(String[]args) {
		
		Scanner value=new Scanner(System.in);
			char m;
			String name,reverse="";
			
		System.out.println("enter the name:");
			 	
		name=value.nextLine();
		System.out.println("enter the reverse word:");
		
		for( int i=0;i< name.length();i++) {
					
			m=name.charAt(i);		
			
			reverse =m +reverse;	
		}
		System.out.println(reverse);
		
	}

}
