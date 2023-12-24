package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryF")
public class TaxSlabCategoryF extends TaxSlab {

	public TaxSlabCategoryF() {
		super();
		this.setCategory('F');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(100000), Double.valueOf(70001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(70000), null, Double.valueOf(3700)));
		this.getRates().add(new TaxRate(Double.valueOf(30000), Double.valueOf(19), null));
	}

}
