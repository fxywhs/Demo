package com.example.taxcalculator.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.taxcalculator.entity.TaxCalculatorRequest;
import com.example.taxcalculator.entity.TaxCalculatorResponse;
import com.example.taxcalculator.entity.TaxSlab;

public class TaxCalculatorService {
	
	private static final Logger logger = LogManager.getLogger(TaxCalculatorService.class);
	
	public TaxCalculatorResponse calculateTax(TaxCalculatorRequest request) {
		logger.info("processing request:" + request.toString());
		TaxCalculatorResponse response = new TaxCalculatorResponse();
		
		TaxSlab taxSlab = new TaxSlab();
		taxSlab.setCategory(new Character('A'));
		taxSlab.setChargeableIncomeBottom(new Double(0));
		taxSlab.setChargeableIncomeTop(new Double(5000));
		taxSlab.setFirstTierTop(new Double(5000));
		taxSlab.setFirstTierTaxAmount(new Double(0));
		taxSlab.setNextTierTop(null);
		taxSlab.setTaxRate(new Double(0));
		
		List<String> taxClaimOptions = new ArrayList<>();
		taxClaimOptions.add("Individual");
		taxClaimOptions.add("Medical");
		
		response.setTaxAmount(new Double(20000));
		response.setTaxSlab(taxSlab);
		response.setTaxClaimOptions(taxClaimOptions);
		
		logger.info("response:" + response.toString());
		return response;
	}

}
