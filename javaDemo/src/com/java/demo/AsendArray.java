package com.java.demo;
import java.util.Scanner;
public class AsendArray {
	public static void main(String[] args) {
		
		Scanner value=new Scanner(System.in);
		System.out.println("enter the size of the no:");
		int number=value.nextInt();
		int[]num=new int[number];
		int type=0;
		System.out.print("enter the number:"+"");
		for(int i=0;i<number;i++) {
		num[i]=value.nextInt();
		}
		
		for(int i=0;i<number;i++) {
			for (int j=i+1;j<number;j++) {
				if(num[i]>num[j]) {
					
					type=num[i];
					num[i]=num[j];
					num[j]=type;
					
					
				}
			}
		}
		System.out.println("no of ascending order:");
		for(int i=0;i<number;i++) {
			System.out.print(num[i]+",");
		}
	}

}
