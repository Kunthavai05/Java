package com.java.demo;
import java.util.Scanner;
public class Stop {
	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("");
		String rk="";
		while (!rk.equals("stop")) {
			rk=scanner.nextLine();
		}
		
		System.out.println("stop");
		
		
	}

}
