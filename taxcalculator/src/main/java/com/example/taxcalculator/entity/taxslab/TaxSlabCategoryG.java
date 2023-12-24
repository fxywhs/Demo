package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryG")
public class TaxSlabCategoryG extends TaxSlab {

	public TaxSlabCategoryG() {
		super();
		this.setCategory('G');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(400000), Double.valueOf(100001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(100000), null, Double.valueOf(9400)));
		this.getRates().add(new TaxRate(Double.valueOf(300000), Double.valueOf(25), null));
	}

}
