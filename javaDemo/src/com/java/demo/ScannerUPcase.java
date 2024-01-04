package com.java.demo;
import java.util.Scanner;
public class ScannerUPcase {
	public static void main(String[] args) {
		
		Scanner value=new Scanner(System.in);
		
		System.out.println("enter the name:");
		
		String x=value.nextLine();
		
		System.out.println("Lower to upper:"+x.toUpperCase());
		
		String y=value.nextLine();

		
		System.out.println("upper to Lower:"+x.toLowerCase());
		
		String z=value.nextLine();

		
		System.out.println("replace the word:"+x.replace(" ", " "));

		
	}

}
