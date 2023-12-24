package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryH")
public class TaxSlabCategoryH extends TaxSlab {

	public TaxSlabCategoryH() {
		super();
		this.setCategory('H');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(600000), Double.valueOf(400001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(400000), null, Double.valueOf(84400)));
		this.getRates().add(new TaxRate(Double.valueOf(200000), Double.valueOf(26), null));
	}

}
