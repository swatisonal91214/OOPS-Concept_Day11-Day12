package com.bl.stock_uc1_uc2;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class StockAccountManagement {
	    static ArrayList<Stock> listStock = new ArrayList<Stock>();
	    Scanner sc = new Scanner(System.in);

	    public int portfolioOfStock() {
	    	int accountbalance = 0;
	        System.out.println("First enter number of stocks: ");
	        int numberOfStocks = sc.nextInt();
	        for (int i = 0; i < numberOfStocks; i++) {
	            System.out.println("Enter the name of share: ");
	            String shareName = sc.next();
	            System.out.println("Enter number of shares: ");
	            int numberOfShares = sc.nextInt();
	            System.out.println("Enter share price: ");
	            int sharePrice = sc.nextInt();
	            listStock.add(new Stock(shareName, numberOfShares, sharePrice));
	            // totalStockValue(numberOfShares * sharePrice);
	            accountbalance = accountbalance + totalValueOfEachStock(numberOfShares, sharePrice);
	         }
	        return accountbalance;
	    }

	    public int totalValueOfEachStock(int numberOfShares, int sharePrice) {
	    	
	        int stockvalue = 0;
	        Iterator<Stock> itr = listStock.iterator();
	        while (itr.hasNext()) {
	            Stock s =itr.next();
	            int stock = s.getNumberOfShares() * s.getSharePrice();
	            System.out.println("Name of the stock: " + s.getStockName());
	            System.out.println("total stock price: " + stock);
	            stockvalue = stockvalue + stock;
	        }
	        System.out.println("total Value of each stock: " + stockvalue);
	        return numberOfShares * sharePrice;
	    }
	    
	    public  void debit(int total_amount) {
	    	System.out.println("Welcome to Debit window!!");
	    	System.out.println("Please enter the amount to be debit!!");
	    	int debitamount = sc.nextInt();
	    	if(debitamount>total_amount) {
	    		System.out.println("Debit amount exceeded account balance");
	    	}
	    	else {
	    		System.out.println("Total Amount debited : " + debitamount);
	    		System.out.println("Amount left in the account : " + (total_amount-debitamount));
	    	}
	    }    

	    public static void main(String[] args) {
	    	int a = 0, b = 0;
	        System.out.println("Welcome to object oriented programs");
	        StockAccountManagement stock = new StockAccountManagement();
	        stock.totalValueOfEachStock(a, b);
	        int total_amount = stock.portfolioOfStock();
	        stock.debit(total_amount);
	    }
	}

