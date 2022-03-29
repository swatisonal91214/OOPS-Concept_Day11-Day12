package com.bl.stockmanagement_uc3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StockImplementation implements IStock{
	String sharename;
	int price_of_share;
	int number_of_share;
	ArrayList<Stock> stock= new ArrayList<Stock>();
	Stock c = new Stock(sharename,price_of_share, number_of_share);
	
	@Override
	public void createStockAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the stock to be created!");
		sharename = sc.nextLine();
		System.out.println("Enter the number of share..!");
		number_of_share = sc.nextInt();
		System.out.println("Enter the price of each share..!");
		price_of_share = sc.nextInt();
		stock.add(new Stock(sharename,price_of_share,number_of_share));
		System.out.println("Account is created for Stock : " + sharename);
	}

	@Override
	public double valueOf() {
		double total_value_of_shares = 0;
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Stock you want to find value!!");
		sharename = sc.nextLine();
		Iterator<Stock> itr = stock.iterator();
		while(itr.hasNext()) {
			Stock s = itr.next();
			if(sharename.equalsIgnoreCase(s.getSharename())) {
				System.out.println("Name of the Stock account : " + s.getSharename());
				System.out.println("Price of each share : " + s.getPrice_of_share());
				System.out.println("Total number of share : " + s.getNumber_of_share());
				System.out.println("Total value of the shares for this stock is " + (s.getNumber_of_share()* s.getPrice_of_share()));
				System.out.println();
				found = true;
			}
			total_value_of_shares = total_value_of_shares+(s.getNumber_of_share()* s.getPrice_of_share());
			if(found == false) {
				System.out.println("No such Stockname exist!!!");
			}
		}
		return total_value_of_shares;
	}

	@Override
	public void buy(String sharename) {
		boolean modified = false;
		Scanner sc = new Scanner(System.in);
		Iterator<Stock> itr = stock.iterator();
		while(itr.hasNext()) {
			Stock s = itr.next();
			if(sharename.equalsIgnoreCase(s.getSharename())) {
				System.out.println();
				System.out.println("Enter the number of shares bought!!");
				number_of_share = sc.nextInt();
				int newshare = s.number_of_share+number_of_share;
				s.setNumber_of_share(newshare);
				System.out.println("New Share is added to existing stock!! ");
				modified = true;
			}
		}
		if(modified == false){
			System.out.println();
			System.out.println("Enter the number of shares bought!!");
			number_of_share = sc.nextInt();
			System.out.println("Enter the price of each share!!");
			price_of_share = sc.nextInt();
			stock.add(new Stock(sharename, price_of_share, number_of_share));
			System.out.println("New stock details are added to the account!! ");
		}
	}
			
	@Override
	public void sell(String sharename) {
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		Iterator<Stock> itr = stock.iterator();
		while(itr.hasNext()) {
			Stock s = itr.next();
			if(sharename.equalsIgnoreCase(s.getSharename())) {
				System.out.println("Enter the number of share you want to sell!!");
				int share_to_be_sold = sc.nextInt();
				if(share_to_be_sold > s.getNumber_of_share()) {
					System.out.println("Entered share to be sold is more than present share!!You have total " +s.getNumber_of_share() + " shares only.");
					System.out.println("Please enter number of share to be sold again!!");
					share_to_be_sold = sc.nextInt();
				}
				share_to_be_sold = s.getNumber_of_share()- share_to_be_sold;
				s.setNumber_of_share(share_to_be_sold);
				System.out.println("Entered shares for the above Stock name is sold..!!");
				System.out.println("******Entered share details are sold!!!**********");
				System.out.println("Below is the details of remaining shares in your account!!!");
				System.out.println();
				printReport();
				found = true;
			}
		}
		if(found == false) {
			System.out.println("No such Stock exists in your Account!!!");
		}
	}

	@Override
	public double printReport() {
		int accountbalance = 0;
		Iterator<Stock> itr = stock.iterator();
		while(itr.hasNext()) {
			Stock s = itr.next();
			System.out.println("Name of the share: " + s.getSharename());
			System.out.println("Number of shares: " + s.getNumber_of_share());
			System.out.println("Price of each share: " + s.getPrice_of_share());
			accountbalance = accountbalance + s.getNumber_of_share()*s.getPrice_of_share();
			System.out.println("Total value of the share is : " + s.getNumber_of_share()*s.getPrice_of_share());
			System.out.println();
		}
		return accountbalance;
	}
}
