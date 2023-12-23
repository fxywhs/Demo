package com.example.taxcalculator.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.taxcalculator.entity.TaxCalculatorResponse;
import com.example.taxcalculator.entity.TaxCalculatorRequest;
import com.example.taxcalculator.service.TaxCalculatorService;

@RestController
@RequestMapping(path="/taxcalculator")
public class TaxCalculatorController {
	
	private TaxCalculatorService TaxCalculatorService = new TaxCalculatorService();
	
	@RequestMapping(path="/calculatetax", method=RequestMethod.POST)
	public TaxCalculatorResponse calculateTax(@RequestBody TaxCalculatorRequest request) {
		return TaxCalculatorService.calculateTax(request);
	}

}