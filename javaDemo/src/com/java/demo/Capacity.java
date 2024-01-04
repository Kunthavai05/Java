package com.java.demo;

public class Capacity {
	
	public static void main(String[] args) {
		
		StringBuffer name=new StringBuffer();
		
		System.out.println(name.capacity());
		
		name.append("kunthavai");
		
		System.out.println(name.capacity());
		
		name .append("i luv kulfiii");
		
		System.out.println(name.capacity());
		
		
		
	}

}



