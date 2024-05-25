package com.billing1;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Customer cs1 = new Customer();
		Customer.getcustomerinfo();
		Customer.order();
		cs1.header();
		cs1.footer();
	}

	public static void order() {
		
		System.out.println(" 1 - Tea" + '\n' + " 2 - Coffie");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Item Number from Given List : ");
		int itemNumber = sc.nextInt();
		System.out.println("Enter Quantity : ");
		int itemQty = sc.nextInt();
		System.out.println("Select 1 to Print Bill OR Select 0 to continue Order : ");
		int addmore = sc.nextInt();
		itemNumber = 0;
		switch (itemNumber) {
		case 1:
			
			System.out.println("Tea         "+itemQty+"           "+itemQty*10);
			
			break;
			
		case 2:
			
			System.out.println("Coffie         "+itemQty+"           "+itemQty*20);
			break;
		}
		
	}
	
	public void header() {
		System.out.println("     Gokul Restaurant"+'\n'+
				"   Near K.E.M. Hospital"+'\n'+
				"Mangalwar Peth, Pune-411011"+'\n'+
				"***************************"+'\n'+
				"---------------------------"+'\n'+
				"       Bill Details"+'\n'+
				"---------------------------"+'\n'+
				"Item       Qty       Amount"
				+'\n'+
				"- - - - - - - - - - - - - -");
		
	}
	
	public static void getcustomerinfo() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter Customer Type : ");
		String ctype = sc2.next();
		System.out.print("Enter Customer Name : ");
		String cname = sc2.next();
		System.out.print("Provide Customer's Mobile Number : ");
		String cmnumber = sc2.next();
		sc2.close();
	}
	
	public void footer() {System.out.println(
		"- - - - - - - - - - - - - -"+'\n'+
		"- - - - - - - - - - - - - -"+'\n'+
		"Total"+'\n'+"Quantity : "+'\n'+
		"Total"+'\n'+ "Amount : "+'\n'+
		"- - - - - - - - - - - - - -"+'\n'+
		"CGST @2.5%"+'\n'+
		"SGST @2.5%"+'\n'+
		"- - - - - - - - - - - - - -"+'\n'+
		"Total Payable Amount: "+'\n'+
		"==========================="+'\n'+
		"FSSAI Lic.No. :  MH02101997"+'\n'+
		"GST No. :    27MH1219970210"+'\n'+
		"CIN No. :  UP06121992BMDJSR"+'\n'+
		"==========================="+'\n'+
		"        Thank You !"+'\n'+
		"       Visit Again !"+'\n'+
		"-------------^-------------");
	}
}
