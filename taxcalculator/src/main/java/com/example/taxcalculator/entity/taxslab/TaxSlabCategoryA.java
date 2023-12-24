package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryA")
public class TaxSlabCategoryA extends TaxSlab {

	public TaxSlabCategoryA() {
		super();
		this.setCategory('A');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(5000), Double.valueOf(0)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(5000), Double.valueOf(0), Double.valueOf(0)));
	}

}
