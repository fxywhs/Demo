package com.example.taxcalculator.entity.taxslab;

public class TaxRate {
	
	private Double amount;
	private Double rate;
	private Double taxAmount;
	
	public TaxRate() {
		super();
	}

	public TaxRate(Double amount, Double rate, Double taxAmount) {
		super();
		this.amount = amount;
		this.rate = rate;
		this.taxAmount = taxAmount;
	}

	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getRate() {
		return rate;
	}
	
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	public Double getTaxAmount() {
		return taxAmount;
	}
	
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Override
	public String toString() {
		return "TaxRate [amount=" + amount + ", rate=" + rate + ", taxAmount=" + taxAmount + "]";
	}

}
