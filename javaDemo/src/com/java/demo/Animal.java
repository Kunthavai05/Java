package com.java.demo;



public class Animal {
	protected String brand="yamaha";
	public void name(){
		System.out.println("enter the name:");
	}
	
	    public static void main(String[]args) {

	    	Animal myObj=new Animal();
	    	
	    	myObj.name();
	    	System.out.println(myObj.brand);
	    }

}
