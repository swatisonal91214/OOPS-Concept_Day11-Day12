package com.bl.stockmanagement_uc3;

public class Stock {
	String sharename;
	int price_of_share;
	int number_of_share;
	
	public Stock(String sharename, int price_of_share,
			int number_of_share) {
		super();
		this.sharename = sharename;
		this.price_of_share = price_of_share;
		this.number_of_share = number_of_share;
	}

	public String getSharename() {
		return sharename;
	}
	
	public void setSharename(String sharename) {
		this.sharename = sharename;
	}
	
	public int getPrice_of_share() {
		return price_of_share;
	}
	
	public void setPrice_of_share(int price_of_share) {
		this.price_of_share = price_of_share;
	}
	
	public int getNumber_of_share() {
		return number_of_share;
	}
	
	public void setNumber_of_share(int number_of_share) {
		this.number_of_share = number_of_share;
	}
	
	@Override
	public String toString() {
		return "Stock [sharename=" + sharename
				+ ", price_of_share=" + price_of_share
				+ ", number_of_share=" + number_of_share
				+ "]";
	}
	
	
}
