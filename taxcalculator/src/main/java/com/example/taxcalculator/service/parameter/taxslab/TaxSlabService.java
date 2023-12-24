package com.example.taxcalculator.service.parameter.taxslab;

import com.example.taxcalculator.entity.taxslab.TaxSlab;
import com.example.taxcalculator.service.parameter.TaxParameterService;

public interface TaxSlabService extends TaxParameterService<TaxSlab> {
	
	public TaxSlab getTaxSlabByIncome(double annualIncome);

}
