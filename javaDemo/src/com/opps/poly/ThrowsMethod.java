package com.opps.poly;
import java.io.*;  

class Testthrows{  
	
	 void method()throws IOException{  
		  System.out.println("device operation performed");  
		 }  
}

public  class ThrowsMethod {
	
	
	 
	   public static void main(String args[])throws IOException{   
		   Testthrows m=new Testthrows();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  

	

	


