package com.example.taxcalculator.entity.taxslab;

import java.util.List;

public class TaxSlab {
	
	private char category;
	private ChargeableIncome chargeableIncome;
	private List<TaxRate> rates;
	
	public TaxSlab() {
		super();
	}

	public TaxSlab(char category, ChargeableIncome chargeableIncome, List<TaxRate> rates) {
		super();
		this.category = category;
		this.chargeableIncome = chargeableIncome;
		this.rates = rates;
	}

	public char getCategory() {
		return category;
	}
	
	public void setCategory(char category) {
		this.category = category;
	}	
	
	public ChargeableIncome getChargeableIncome() {
		return chargeableIncome;
	}

	public void setChargeableIncome(ChargeableIncome chargeableIncome) {
		this.chargeableIncome = chargeableIncome;
	}

	public List<TaxRate> getRates() {
		return rates;
	}

	public void setRates(List<TaxRate> rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		return "TaxSlab [category=" + category + ", chargeableIncome=" + chargeableIncome + ", rates=" + rates + "]";
	}	

}