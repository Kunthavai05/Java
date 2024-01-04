package com.java.demo;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Addition {
	public static void main(String[]arg){
		String FirstName="kunthavai";
		String LastName="Ram";
		String FullName=FirstName+LastName;
		System.out.println(FullName);
		int value;
		value=5;
		System.out.println(value);
		int Num=23;
		System.out.println(Num);
		int Mynum=5;
		Mynum=23;
		System.out.println(Mynum);
		int x=5;
		int y=10;
		int z=15;
		System.out.println(x+y+z);
		int a=5,b=3,c=2;
		System.out.println(a+b+c);
		int kiloMeter=5;
		int KM=5;
		int R,A,M;
		R=A=M=23;
		System.out.println(R+A+M);
		byte myNum=98;
		System.out.println(myNum);
		short v=3000;
		System.out.println(v);
		int t=1000;
		System.out.println(t);
		long l=5100000000l;
		System.out.println(l);
		float f=0.11f;
		System.out.println(f);
		double d=54.001d;
		System.out.println(d);
		float o1=35e3f;
		double y1=15E3d;
		System.out.println(o1);
		System.out.println(y1);
		boolean isjava=true;
		boolean isfun=false;
		System.out.println(isjava);
		System.out.println(isfun);
		char Letter='R';
		System.out.println(Letter);
		char code1='5';
				char code2='4';
						char code3='3';
		System.out.println(code1);
		System.out.println(code2);
		System.out.println(code3);
		String Word="Love You Ma";
		System.out.println(Word);
		int myInt=5;
		double myDouble=myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
	    double myD=1.73d;
	    int myI=(int)myD;
	    System.out.println(myD);
	    System.out.println(myI);
	    int sum1=100;
	    int sum2=50+sum1;
	    int sum3=sum2+sum2;
	    System.out.println(sum3);
	    int q=10;
	    q+=30;
	    System.out.println(q);
	    int h=100;
	    int j=10;
	    System.out.println(h>j);
	    String say="hi";
	    System.out.println(say);
	    String txt="kunthavai ramasubramaniyan";
	    System.out.println("the length of the txt is="+txt.length());
	    String line="Love You Ma";
	    System.out.println(line.toUpperCase());
	    System.out.println(line.toLowerCase());
	    String phar="a for apple";
	    System.out.println(phar.indexOf("for"));
	    String frist="kunthavai";
	    String last="ram";
	    System.out.println(frist+" "+last);
	    String one="kunthavai";
	    String two="ram";
	    System.out.println(one.concat(last));
	    
	    
	    
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	       // SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	        
	        Date date = new Date();
	        System.out.println( "                "+ dateFormat.format(date));
	        
	      LocalTime time = LocalTime.now();  
	        System.out.println("---------------------------"+ (time));  
	    
	 
	}

}
