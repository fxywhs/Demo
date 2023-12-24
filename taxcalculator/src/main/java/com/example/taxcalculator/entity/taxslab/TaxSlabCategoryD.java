package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryD")
public class TaxSlabCategoryD extends TaxSlab {

	public TaxSlabCategoryD() {
		super();
		this.setCategory('D');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(50000), Double.valueOf(35001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(35000), null, Double.valueOf(600)));
		this.getRates().add(new TaxRate(Double.valueOf(15000), Double.valueOf(6), null));
	}

}
