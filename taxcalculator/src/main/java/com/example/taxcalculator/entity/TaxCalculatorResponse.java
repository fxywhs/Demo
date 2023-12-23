package com.example.taxcalculator.entity;

import java.util.List;

public class TaxCalculatorResponse {

	private Double taxAmount;
	private TaxSlab taxSlab;
	private List<String> taxClaimOptions;
	
	public TaxCalculatorResponse() {
		super();
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public TaxSlab getTaxSlab() {
		return taxSlab;
	}

	public void setTaxSlab(TaxSlab taxSlab) {
		this.taxSlab = taxSlab;
	}

	public List<String> getTaxClaimOptions() {
		return taxClaimOptions;
	}

	public void setTaxClaimOptions(List<String> taxClaimOptions) {
		this.taxClaimOptions = taxClaimOptions;
	}	
	
}