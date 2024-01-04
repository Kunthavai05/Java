package com.java.demo;

	
	class poly{  
		  void run(){System.out.println("running");}  
		}  
		class Splendor extends poly{  
		  void run(){System.out.println("running safely with 60km");}  
		  
		}  
		  
		 public  class Bike1{  
		  
		  
		  public static void main(String args[]){  
			  poly b = new Splendor();  
		    b.run();  
		  }  
		}  
		

