package com.example.taxcalculator.entity;

public class TaxCalculatorRequest {
	
	private Double annualIncome;

	public TaxCalculatorRequest() {
		super();
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

}
