package com.opps.poly;

public class ThrowMethod {
	
	public static void validate(int age) {  
        if(age<18) {  
            throw new ArithmeticException("not eligible to vote");    
        }  
        else {  
            System.out.println(" eligible to vote!!");  
        }  
    }  
    public static void main(String args[]){  
        validate(35);  
        System.out.println("rest of the code...");    

    }
}
