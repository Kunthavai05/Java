package com.java.demo;
import java.util.Scanner;
public class ass4 {
	public static void main(String[] args) {
		
	
	Scanner value =new Scanner(System.in);
	
		System.out.println("enter the number of a:");
	int num=value.nextInt();

	System.out.println("enter the number of b:");
	int n=value.nextInt();
	
	int[] m= {num,n};

	System.out.println("eneter the num:");
	System.out.print("[");

	for(int i=num;i<=n;i++) {
		

		System.out.print(i+" ");
	}
	 System.out.print("]");

	int big=m[0];
	int small=m[0];
	for(int i=0;i<m.length;i++) {
		
		value.nextLine();
		 if(m[i]>big) {
			 big=m[i]; 
		 }
		 
		 if(m[i]<small) {
			 small=m[i];

		 }
		 

	}
			System.out.println("enter the big value:"+big);
			System.out.println("enter the small value:"+small);

		
		for(int i=num;i<=n;i++) {
			if(i%2==0){
				System.out.println(i+"even");
				
			}
			
			if(i%2!=0){
				System.out.println(i+"odd");
				
			}

		}
	

}
} 