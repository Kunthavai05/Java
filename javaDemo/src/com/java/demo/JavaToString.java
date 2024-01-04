package com.java.demo;

public class JavaToString {
	
		
		
		int rate;
		 
		String carname;
		
		String brand;
		
		JavaToString(int rate,String carname,String brand){
			
			
			this.rate=rate;
			this.carname=carname;
			this.brand=brand;
		}
		
		public String toString() {
			
		return rate+","+carname+","+brand;
		
		
	}

public static void main(String[]args) {
	
	JavaToString detail1=new  JavaToString(340000,"thar","mahindra");
	
	JavaToString detail2=new  JavaToString(850000,"supra","toyota");
	
	
	System.out.println(detail1);
	
	System.out.println(detail2);

}

}
