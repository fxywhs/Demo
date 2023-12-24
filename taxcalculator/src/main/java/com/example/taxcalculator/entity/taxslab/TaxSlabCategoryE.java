package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryE")
public class TaxSlabCategoryE extends TaxSlab {

	public TaxSlabCategoryE() {
		super();
		this.setCategory('E');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(70000), Double.valueOf(50001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(50000), null, Double.valueOf(1500)));
		this.getRates().add(new TaxRate(Double.valueOf(15000), Double.valueOf(11), null));
	}

}
