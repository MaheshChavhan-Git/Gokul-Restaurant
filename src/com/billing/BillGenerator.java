package com.billing;


import java.util.Scanner;

public class BillGenerator{
	private static String ctype;
	private static String cname;
	private static String cmnum;
	
    public BillGenerator(String ctype, String cname , String cmnum) {
    	this.ctype=ctype;
    	this.cname=cname;
    	this.cmnum=cmnum;
		
	}
	public void header() {
		System.out.println("     Gokul Restaurant"+'\n'+
				"   Near K.E.M. Hospital"+'\n'+
				"Mangalwar Peth, Pune-411011"+'\n'+
				"***************************");
		
	}
	
	public static void customerinfo() {
		System.out.println("Customer Type :     "+ctype);
		System.out.println("Customer Name :     "+cname);
		System.out.println("Contact Number: "+cmnum);
	}
	
	public void footer() {
		System.out.println("FSSAI Lic.No. :  MH02101997"+'\n'+
				"GST No. :    27MH1219970210"+'\n'+
				"CIN No. :  UP06121992BMDJSR"+'\n'+
				"==========================="+'\n'+
				"        Thank You !"+'\n'+
				"       Visit Again !"+'\n'+
				"-------------^-------------");
	}
	
	/*public void customerinfo() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Customer Type : ");
		String ctype = sc1.next();
		System.out.println("Enter Customer Name : ");
		String cname = sc1.next();
		System.out.println("Provide Customer's Mobile Number : ");
		int cmnumber = sc1.nextInt();
	}*/
	
	public static void main(String args[]) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter Customer Type : ");
		String ctype = sc1.next();
		System.out.print("Enter Customer Name : ");
		String cname = sc1.next();
		System.out.print("Provide Customer's Mobile Number : ");
		String cmnumber = sc1.next();
		sc1.close();
		BillGenerator bg = new BillGenerator(ctype,cname,cmnumber);
		bg.customerinfo();
		bg.header();
		//bg.printbill();
		bg.footer();
		
		
	}
}
