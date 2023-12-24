package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryB")
public class TaxSlabCategoryB extends TaxSlab {

	public TaxSlabCategoryB() {
		super();
		this.setCategory('B');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(20000), Double.valueOf(5001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(5000), null, Double.valueOf(0)));
		this.getRates().add(new TaxRate(Double.valueOf(15000), Double.valueOf(1), null));
	}

}
