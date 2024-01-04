package com.java.demo;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[]args) {
		int i=0;
		String name;
		Scanner value = new Scanner(System.in);
		
		System.out.println("enter the name:");
		
		name=value.nextLine();
		
		while(i<name.length()){		
			
			System.out.println(name.charAt(i));
		}
		
		
	}

}
