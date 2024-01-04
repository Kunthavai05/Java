package com.java.demo;
import java.util.Scanner;
public class Ass3 {
	public static void main(String[] args) {
		
		Scanner word=new Scanner(System.in);
		System.out.println("enter a big word:");
		String bigword=word.nextLine();
		
		
		System.out.println("bigword in reverse order:");
		
		for (int i=bigword.length();i>0;--i) {
			
		}
		String name=word.nextLine();

		int midIndex = bigword.length()/2 ; 
  		String firstHalf = bigword.substring(0, midIndex); 
  		String secondHalf = bigword.substring(midIndex); 
  		System.out.println("First half: " +firstHalf ); 
  		
  		System.out.println("Second half: " + secondHalf);

		int uniqueChars=countUniqueChars(bigword);

		System.out.println("Number of unique chars:  "+uniqueChars);
		
		System.out.println("Character\tcOccurrences");
		for(int i=0;i<bigword.length();i++) {
			char m= bigword.charAt(i);

		int count=countOccurrences(bigword,m);
		
		if (count>0) {
			System.out.println(m+"\t\t"+count);
			bigword=bigword.replace(""+m,"");
			i--;
		}
		
		}
			}
	private static int countUniqueChars(String bigword) {
		int count=0;
		
		for(int i=0;i<bigword.length();i++) {
			
			char m= bigword.charAt(i);

			if (bigword.indexOf(m)==i) {
				count++;

			}
		}
			
			return count;
	}

		private static int countOccurrences(String bigword,char m) {
			
			int count= 0;
			for (int i=0;i<bigword.length();i++) {
				if(bigword.charAt(i) ==m){
					count++;}}
			
			return count;	
				}							
}
			
		
	
	


