package com.java.demo;

public class Builder {
	
	public static void main(String[] args) {
		
		StringBuffer name=new StringBuffer("kunthavai");
		
		name.insert(0,"ram");
		
		System.out.println(name);
		
		System.out.println("-----------------------------");
		
		StringBuffer value=new StringBuffer("kunthavai");
		
		value.append("ramasubu");
		
		System.out.println(value);
		
		
		System.out.println("-----------------------------");
		
		StringBuffer m =new StringBuffer("kunthavai");
		
		m.replace(0,0 ,"subu");
		
		System.out.println(m);
		
		System.out.println("-----------------------------");
		
		
		StringBuffer mahe=new StringBuffer("kunthavai");
		
		mahe.delete(2,3);
		
		System.out.println(mahe);

		System.out.println("-----------------------------");

		
	}
	
	

}
