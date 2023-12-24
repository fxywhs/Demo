package com.example.taxcalculator.entity.taxslab;

public class ChargeableIncome {
	
	private Double top;
	private Double bottom;
	
	public ChargeableIncome() {
		super();
	}

	public ChargeableIncome(Double top, Double bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}

	public Double getTop() {
		return top;
	}
	
	public void setTop(Double top) {
		this.top = top;
	}
	
	public Double getBottom() {
		return bottom;
	}
	
	public void setBottom(Double bottom) {
		this.bottom = bottom;
	}

	@Override
	public String toString() {
		return "ChargeableIncome [top=" + top + ", bottom=" + bottom + "]";
	}

}
