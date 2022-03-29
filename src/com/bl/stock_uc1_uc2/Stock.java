package com.bl.stock_uc1_uc2;

	public class Stock {
	     String stockName;
	     int numberOfShares;
	     int sharePrice;


	    public Stock(String stockName, int numberOfShares, int sharePrice) {

	        this.stockName = stockName;
	        this.numberOfShares = numberOfShares;
	        this.sharePrice = sharePrice;
	    }

	    public String getStockName() {
	        return stockName;
	    }

	    public void setStockName(String stockName) {
	        this.stockName = stockName;
	    }

	    public int getNumberOfShares() {
	        return numberOfShares;
	    }

	    public void setNumberOfShares(int numberOfShares) {
	        this.numberOfShares = numberOfShares;
	    }

	    public int getSharePrice() {
	        return sharePrice;
	    }

	    public void setSharePrice(int sharePrice) {
	        this.sharePrice = sharePrice;
	    }

	    @Override
	    public String toString() {
	        return "Stock [stockName=" + stockName + ", numberOfShares=" + numberOfShares + ", sharePrice=" + sharePrice
	                + "]";
	    }
	}

