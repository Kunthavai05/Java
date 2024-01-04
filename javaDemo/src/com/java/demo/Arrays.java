package com.java.demo;

public class Arrays {
	public static void main(String[] args) {
		String[]bike= {"RX(*-*)","bullet(^-^)"};
		for(int i=0;i<bike.length;i++) {
		 System.out.println(bike[i]);
		}
	System.out.println("-------------------------------------------");
	
	String[]cars= {"Thar","supra","contessa"};
	cars[0]="contessa";
	System.out.println(cars[0]);
	
	System.out.println("*******************************************");
	
	String[]colors= {"blue","black","white"};
	
	System.out.println(colors.length);
	
	System.out.println("-------------------------------------------");
	
	int[]m=new int[5];
	
	m[0]=10;
	m[1]=20;
	m[2]=30;
	m[3]=40;
	m[4]=50;
	for(int i=0;i<m.length;i++) {
		System.out.println(m[i]);
	}
	}

}
