package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryJ")
public class TaxSlabCategoryJ extends TaxSlab {

	public TaxSlabCategoryJ() {
		super();
		this.setCategory('J');
		this.setChargeableIncome(new ChargeableIncome(null, Double.valueOf(2000001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(2000000), null, Double.valueOf(528400)));
		this.getRates().add(new TaxRate(null, Double.valueOf(30), null));
	}

}
