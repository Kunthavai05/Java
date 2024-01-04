package com.java.demo;

 class Vehicle {
	String brand="yamaha";
	public void name(){
		System.out.println("enter the name:");
		
		
	}
 
 }
class Bike extends Vehicle {
	  public String modelName = "RX-100";
	  
}

	  public class TestVehicle {

		  
    public static void main(String[]args) {
    	
    	Bike myObj=new Bike();
    	
    	myObj.name();
    	System.out.println(myObj.brand+"    "+myObj.modelName);
    }

	  }
