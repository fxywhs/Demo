package com.example.taxcalculator.service.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taxcalculator.entity.TaxCalculatorResponse;
import com.example.taxcalculator.entity.taxslab.TaxRate;
import com.example.taxcalculator.entity.taxslab.TaxSlab;
import com.example.taxcalculator.service.parameter.taxclaim.TaxClaimOptionsService;
import com.example.taxcalculator.service.parameter.taxslab.TaxSlabService;

@Service
public class TaxCalculator {
	
	private static final Logger logger = LogManager.getLogger(TaxCalculator.class);
	
	@Autowired
	private TaxSlabService taxSlabService;
	@Autowired
	private TaxClaimOptionsService taxClaimOptionsService;
	
	public TaxCalculatorResponse calculateTax(double request) {
		logger.info("processing request annualIncome = " + request);
		TaxCalculatorResponse response = new TaxCalculatorResponse();
		
		TaxSlab taxSlab = taxSlabService.getTaxSlabByIncome(request);
		
		double taxAmount = 0;
		double chargeableIncome = request;
		for (TaxRate rate : taxSlab.getRates()) {
			if (rate.getRate() == null) {
				taxAmount = taxAmount + rate.getTaxAmount();
				chargeableIncome = chargeableIncome - rate.getAmount();
			} else {
				taxAmount = taxAmount +(rate.getRate()/100*chargeableIncome);
			}
		}
		
		response.setTaxAmount(taxAmount);
		response.setTaxSlab(taxSlab);
		response.setTaxClaimOptions(taxClaimOptionsService.getAll());
		
		logger.info("response:" + response.toString());
		return response;
	}

}
