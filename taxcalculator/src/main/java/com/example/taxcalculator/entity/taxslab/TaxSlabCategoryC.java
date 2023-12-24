package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryC")
public class TaxSlabCategoryC extends TaxSlab {

	public TaxSlabCategoryC() {
		super();
		this.setCategory('C');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(35000), Double.valueOf(20001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(20000), null, Double.valueOf(150)));
		this.getRates().add(new TaxRate(Double.valueOf(15000), Double.valueOf(3), null));
	}

}
