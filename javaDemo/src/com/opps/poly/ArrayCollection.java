package com.opps.poly;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayCollection {
	public static void main(String[] args) {
		
		Scanner value=new Scanner(System.in);
		System.out.println("enter the start no:");
		int x=value.nextInt();
		System.out.println("enter the end no:");

		int y=value.nextInt();

		System.out.println("enter the all no:");

		  ArrayList<Integer> a =new ArrayList<Integer>(); 

				for(int i=x;i<=y;i++) {

			  a.add(i);
				}
				  System.out.print(a);
				  
				  ArrayList<Integer> evennum =new ArrayList<Integer>(); 

				  ArrayList<Integer> oddnum =new ArrayList<Integer>(); 

				  for(Integer n:a) {
					  
						if(n%2==0) {
							evennum.add(n);
				  }  
						else{
							oddnum.add(n);
						  }
				  }
				  System.out.println();

						  System.out.println("odd num:"+oddnum);					  
						  System.out.println("even num:"+evennum);
	}

}
