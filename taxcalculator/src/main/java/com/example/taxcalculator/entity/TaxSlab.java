package com.example.taxcalculator.entity;

public class TaxSlab {
	
	private Character category;
	private Double chargeableIncomeBottom;
	private Double chargeableIncomeTop;
	private Double firstTierTop;
	private Double firstTierTaxAmount;
	private Double nextTierTop;
	private Double taxRate;
	
	public TaxSlab() {
		super();
	}

	public Character getCategory() {
		return category;
	}
	
	public void setCategory(Character category) {
		this.category = category;
	}
	
	public Double getChargeableIncomeBottom() {
		return chargeableIncomeBottom;
	}
	
	public void setChargeableIncomeBottom(Double chargeableIncomeBottom) {
		this.chargeableIncomeBottom = chargeableIncomeBottom;
	}
	
	public Double getChargeableIncomeTop() {
		return chargeableIncomeTop;
	}
	
	public void setChargeableIncomeTop(Double chargeableIncomeTop) {
		this.chargeableIncomeTop = chargeableIncomeTop;
	}
	
	public Double getFirstTierTop() {
		return firstTierTop;
	}
	
	public void setFirstTierTop(Double firstTierTop) {
		this.firstTierTop = firstTierTop;
	}
	
	public Double getFirstTierTaxAmount() {
		return firstTierTaxAmount;
	}
	
	public void setFirstTierTaxAmount(Double firstTierTaxAmount) {
		this.firstTierTaxAmount = firstTierTaxAmount;
	}
	
	public Double getNextTierTop() {
		return nextTierTop;
	}
	
	public void setNextTierTop(Double nextTierTop) {
		this.nextTierTop = nextTierTop;
	}
	
	public Double getTaxRate() {
		return taxRate;
	}
	
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

}