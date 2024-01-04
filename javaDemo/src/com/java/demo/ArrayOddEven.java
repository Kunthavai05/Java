package com.java.demo;
import java.util.Scanner;
public class ArrayOddEven {
	public static void main(String[] args) {
		
		Scanner value=new Scanner(System.in);
		
		System.out.println("enter size of the number:");
		 
		int no=value.nextInt();

		int[]number=new int[no];
		System.out.println("enter no:");

		
		for(int i=0;i<no;i++) {
			number[i]=value.nextInt();
		}
		int big=number[0];
		int small=number[0];

		for(int i=1;i<no;i++) {
			if(number[i]>big) {
				big=number[i];
			}
				
				if(number[i]<small) {
					small=number[i];	
			
		}		
		}
				System.out.println("enter the small value:"+small);
				System.out.println("enter the big value:"+big);

			for(int i=0;i<=number.length-1;i++) {
				if(i%2==0) {
					System.out.println(number[i]+":Even");
				}
				
				
				if(i%2!=0) {
					System.out.println(number[i]+":odd");
				}

			}	
	}

} 
