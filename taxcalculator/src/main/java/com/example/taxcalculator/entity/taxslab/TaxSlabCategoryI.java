package com.example.taxcalculator.entity.taxslab;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("categoryI")
public class TaxSlabCategoryI extends TaxSlab {

	public TaxSlabCategoryI() {
		super();
		this.setCategory('I');
		this.setChargeableIncome(new ChargeableIncome(Double.valueOf(2000000), Double.valueOf(600001)));
		this.setRates(new ArrayList<TaxRate>());
		this.getRates().add(new TaxRate(Double.valueOf(600000), null, Double.valueOf(136400)));
		this.getRates().add(new TaxRate(Double.valueOf(1400000), Double.valueOf(28), null));
	}

}
