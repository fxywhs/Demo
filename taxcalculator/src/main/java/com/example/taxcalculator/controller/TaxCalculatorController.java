package com.example.taxcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.taxcalculator.entity.TaxCalculatorResponse;
import com.example.taxcalculator.service.calculator.TaxCalculator;

@RestController
public class TaxCalculatorController {
	
	@Autowired
	private TaxCalculator taxCalculator;
	
	@RequestMapping(path="/tax", method=RequestMethod.GET)
	public TaxCalculatorResponse calculateTax(@RequestParam(name="annualIncome") Double annualIncome) {
		return taxCalculator.calculateTax(annualIncome);
	}

}