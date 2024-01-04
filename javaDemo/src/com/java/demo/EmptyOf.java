package com.java.demo;

public class EmptyOf {
	
	public static void main(String[] args) {
		
		String m1="kunthavai";  
		String m2=" ";
		System.out.println(m1.isEmpty());
		
		System.out.println(m2.isEmpty());
		
		System.out.println("**************************************");
		
		if(m1.length()==0||m1.isEmpty()){
			
			System.out.println("m1 is empty");
			
		}else {

			System.out.println("m1 is not empty");
		}

        	}

}
