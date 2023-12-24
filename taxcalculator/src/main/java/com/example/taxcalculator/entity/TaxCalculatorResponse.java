package com.example.taxcalculator.entity;

import java.util.List;

import com.example.taxcalculator.entity.taxclaimoptions.TaxClaimOptions;
import com.example.taxcalculator.entity.taxslab.TaxSlab;

public class TaxCalculatorResponse {

	private Double taxAmount;
	private TaxSlab taxSlab;
	private List<TaxClaimOptions> taxClaimOptions;
	
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

	public List<TaxClaimOptions> getTaxClaimOptions() {
		return taxClaimOptions;
	}

	public void setTaxClaimOptions(List<TaxClaimOptions> taxClaimOptions) {
		this.taxClaimOptions = taxClaimOptions;
	}

	@Override
	public String toString() {
		return "TaxCalculatorResponse [taxAmount=" + taxAmount + ", taxSlab=" + taxSlab + ", taxClaimOptions="
				+ taxClaimOptions + "]";
	}	
	
}