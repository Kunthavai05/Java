package com.java.demo;

public class IndexOf {
	
	public static void main(String[] args) {
		
		String word="money is god of the society";
		
		int v1= word.indexOf("is");
		
		int v2=word.indexOf("o",10);
		
		System.out.println(v1+"  "+v2);
		
	}

}
