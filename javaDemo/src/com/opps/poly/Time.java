package com.opps.poly;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter Name. Age, Number :");

		String Name= myObj.nextLine();
		
		int Age = myObj.nextInt();
		
		long Number = myObj.nextLong();
		
		System.out.println();
		System.out.println("Name:"+Name);
		System.out.println("Age:"+ Age);
		System.out.println("Number:" + Number);
	System.out.println();
		LocalDateTime myTime = LocalDateTime.now();
		
		System.out.println(myTime);
		System.out.println();
		DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = myTime.format(formattedDate);

		    System.out.println(formattedDateTime );
	   
	   
	}

}
