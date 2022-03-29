package com.bl.stockmanagement_uc3;

import java.util.Scanner;

public class StockManagementMain {
	public static void main(String[] args) {
		String stockname ;
		boolean exit = false;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("********Welcome to Stock Management system!!!********");
		System.out.println();
		IStock stockobj = new StockImplementation();
		
		while(!exit){
			System.out.println("***********Please select the operation you want to perform..!!***********");
			System.out.println();
			System.out.println(" 1.Create Stock Account  2. Print All details  3.View details of a particular account ");
			System.out.println(" 4.Buy a new share   5.Sell an existing account  6. Exit");
			option = sc.nextInt();
			
			switch(option) {
			
			case 1: System.out.println("Create Account option is selected.. Please enter the details!!");
					stockobj.createStockAccount();
					break;
				
			case 2: System.out.println("*******Details of complete stock with total Account Balance is printed below!!*********");
					System.out.println();
					double accountbalance = stockobj.printReport();
					System.out.println("The total account balance of all the shares is : " +accountbalance);
					System.out.println();
					break;
				
			case 3: System.out.println("*********You have selected to view details of your share!!!************");
					System.out.println();
					stockobj.valueOf();
					break;
		
				
			case 4: Scanner sca = new Scanner(System.in);
					System.out.println("******You have bought a new share. Please enter the below details******");
					System.out.println("Please enter the name of the share!!!");
					stockname = sca.nextLine();
					stockobj.buy(stockname);
					break;
		        
			case 5 :Scanner scb = new Scanner(System.in);
					System.out.println("********You have selected to sell your share.  Please enter the below details*******");
					System.out.println("Please enter the name of the share!!!");
					stockname = scb.nextLine();
					stockobj.sell(stockname);
					break;
		        
			case 6: exit = true;
				System.out.println("**********You have exited the program!!**********");
			}
		}
	}
}
