package com.billing;

import java.util.Scanner;

public class GetValuesAndCalculateBill {
	//static char addmore = 'n';
	public static void printbill() {
		System.out.println(" 1 - Tea"+'\n'+
				" 2 - Coffie"+'\n'+
				" 3 - Salad"+'\n'+
				" 4 - Paneer Butter Masala"+'\n'+
				" 5 - Paneer Hundi"+'\n'+
				" 6 - Mix Veg"+'\n'+
				" 7 - Dal Fry"+'\n'+
				" 8 - Butter Nan"+'\n'+
				" 9 - Chapati"+'\n'+
				"10 - Plain Rice"+'\n'+
				"11 - Jeera Rice"+'\n'+
				"12 - Gulab Jamun"+'\n'+
				"13 - Ice-Cream"+'\n'+
				"14 - Water Bottels"+'\n'+
				"---------------------------------------");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Item Number from Given List : ");
		int itemNumber = sc1.nextInt() ;
		switch(itemNumber) {
		case 1:
			System.out.println("Enter Quantity of Tea : ");
			int teaQty = sc1.nextInt();
			System.out.println("Enter 1 to add more items / Enter 0 to Exit and Print Bill");
			int addmore = sc1.nextInt();
			if(addmore == 1) {
				System.out.println("Enter Item Number from Given List : ");
				int itemNumbercase1 = sc1.nextInt();
			    itemNumbercase1 = itemNumber; 
			}
			else {
				
			}
			System.out.println("Tea    "+teaQty+"    "+teaQty*10);
			break;
			
		case 2:
			System.out.println("Enter Quantity of Salad : ");
			int saladQty = sc1.nextInt();
			System.out.println("Salad   "+saladQty+"    "+saladQty*40);
			break;
			
		case 3:
			System.out.println("Enter Quantity of Paneer Butter Masala : ");
			int pbmQty = sc1.nextInt();
			System.out.println("PBM   "+pbmQty+"    "+pbmQty*200);
			break;
		}
		
		
		
		/*System.out.println(" 1 - Tea"+'\n'+
				" 2 - Coffie"+'\n'+
				" 3 - Salad"+'\n'+
				" 4 - Paneer Butter Masala"+'\n'+
				" 5 - Paneer Hundi"+'\n'+
				" 6 - Mix Veg"+'\n'+
				" 7 - Dal Fry"+'\n'+
				" 8 - Butter Nan"+'\n'+
				" 9 - Chapati"+'\n'+
				"10 - Plain Rice"+'\n'+
				"11 - Jeera Rice"+'\n'+
				"12 - Gulab Jamun"+'\n'+
				"13 - Ice-Cream"+'\n'+
				"14 - Water Bottels"+'\n'+
				"---------------------------------------");
		System.out.print("To Generate Bill "+'\n'+"Select Item's Number from Given List : ");
		int itemNo = sc1.nextInt();
		System.out.print("Enter Item Quantity : ");
		int itemQty = sc1.nextInt();
		System.out.print("Want to add more Items ?"+'\n'+"Select Y or N ");
		char addmore = sc1.next().charAt(0);
		/*System.out.println
				("---------------------------"+'\n'+
				"       Bill Details"+'\n'+
				"---------------------------"+'\n'+
				"Item       Qty       Amount"
				+'\n'+
				"- - - - - - - - - - - - - -"+'\n'+
				"- - - - - - - - - - - - - -"+'\n'+
				"Total"+'\n'+"Quantity : "+'\n'+
				"Total"+'\n'+ "Amount : "+'\n'+
				"- - - - - - - - - - - - - -"+'\n'+
				"CGST @2.5%"+'\n'+
				"SGST @2.5%"+'\n'+
				"- - - - - - - - - - - - - -"+'\n'+
				"Total Payable Amount: "+'\n'+
				"===========================");*/
		
	}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			GetValuesAndCalculateBill gvacb = new GetValuesAndCalculateBill();
					gvacb.printbill();
		}
}
