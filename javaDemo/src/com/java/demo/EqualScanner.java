package com.java.demo;
import java.util.Scanner;
public class EqualScanner {
	public static void main(String[]args) {
		
		Scanner value=new Scanner(System.in);
		System.out.println("name1"); 
		String name1=value.nextLine();
		System.out.println("name2"); 
		String name2=value.nextLine();
		
		System.out.println(name1.equals(name2));
		
			}

}
