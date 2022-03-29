package com.bl.stockmanagement_uc3;

public interface IStock {
	public void createStockAccount();
	public double valueOf();
	public void buy(String stock);
	public double printReport();
	public void sell(String stock);
}
