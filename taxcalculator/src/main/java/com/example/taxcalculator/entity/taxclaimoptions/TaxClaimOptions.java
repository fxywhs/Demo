package com.example.taxcalculator.entity.taxclaimoptions;

public class TaxClaimOptions {
	
	private String description;
	private Double amount;
	
	public TaxClaimOptions() {
		super();
	}

	public TaxClaimOptions(String description, Double amount) {
		super();
		this.description = description;
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TaxClaimOptions [description=" + description + ", amount=" + amount + "]";
	}	

}
