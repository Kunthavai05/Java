package com.java.demo;

public class ForSplit {
	
	public static void main(String[] args) {
		
		String name="love you ma";
		String[]m=name.split("\\s");
		for (String m1:m) {
		System.out.println(m1);
		
		}
	}

}
