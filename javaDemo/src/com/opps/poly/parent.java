package com.opps.poly;

interface thar{
	 void Tcompanyname();
}

interface supra{
	 void Scompanyname();
 
}

interface contessa{
	 void Ccompanyname();
}

interface mustang{
	 void Mcompanyname();
}

interface vehicle extends thar,supra,contessa,mustang{
	void companyname();
}

public class parent implements vehicle {
	
	public void  companyname() {
		System.out.println("enter the company names:");
	}

	
	public void  Tcompanyname() {
		System.out.println("Mahindra");
	}
	
	public void  Scompanyname() {
		System.out.println("toyota");
	}
	
	public void  Ccompanyname() {
		System.out.println("hindustan");
	}
	
	
	public void  Mcompanyname() {
		System.out.println("ford");
	}

public static void main(String[]args) {
	parent myObj=new parent();
	myObj.companyname();
	myObj.Tcompanyname();

	myObj.Scompanyname();

	myObj.Ccompanyname();

	myObj.Mcompanyname();

}

}
