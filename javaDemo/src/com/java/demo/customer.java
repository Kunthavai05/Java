package com.java.demo;

public class customer {
	    private Integer rate ;
		private String carName;
		private String color ;
		private String features;
		private double milage;
		private  boolean isupdate;

private static Strings officename;
private  final static String officecode="mahindra160";

public void setrate(Integer rate) {
	this.rate=rate;		
}
	
public Integer getrate() {
	return this.rate;
}
public void setName(String carName) {
	this.carName =carName;
}
public String getcarname() {
	return this.carName;
}

public void setcolor(String color) {
	this.color =color;
}

public String getcolor() {
	return this.color;
}

public static void main(String[]args) {
	customer customerObj =new customer();
	System.out.println("rate:"+customerObj.getrate()+", carName:"+customerObj.getcarname()+",color:"+customerObj.getcolor() );
	customerObj.setrate(400000);
	customerObj.setName("Thar(^_^)");
	customerObj.setcolor("Black");
	
	System.out.println("---------------------------------------------------------");
	System.out.println("rate:"+customerObj.getrate()+",carName:"+customerObj.getcarname()+",color:"+customerObj.getcolor() );

}
	    }
	    
	    
	    

