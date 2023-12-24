package com.example.taxcalculator.service.parameter.taxslab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.taxcalculator.entity.taxslab.TaxSlab;
import com.example.taxcalculator.service.parameter.TaxParameterServiceImpl;

@Service("taxSlabService")
public class TaxSlabServiceImpl extends TaxParameterServiceImpl<TaxSlab> implements TaxSlabService {

	@Autowired
	@Qualifier("categoryA")
	private TaxSlab categoryA;
	@Autowired
	@Qualifier("categoryB")
	private TaxSlab categoryB;
	@Autowired
	@Qualifier("categoryC")
	private TaxSlab categoryC;
	@Autowired
	@Qualifier("categoryD")
	private TaxSlab categoryD;
	@Autowired
	@Qualifier("categoryE")
	private TaxSlab categoryE;
	@Autowired
	@Qualifier("categoryF")
	private TaxSlab categoryF;
	@Autowired
	@Qualifier("categoryG")
	private TaxSlab categoryG;
	@Autowired
	@Qualifier("categoryH")
	private TaxSlab categoryH;
	@Autowired
	@Qualifier("categoryI")
	private TaxSlab categoryI;
	@Autowired
	@Qualifier("categoryJ")
	private TaxSlab categoryJ;
	
	@Override
	public TaxSlab getTaxSlabByIncome(double annualIncome) {
		initialized();
		TaxSlab response = null;
		for (TaxSlab taxSlab : this.getAll()) {
			if (taxSlab.getChargeableIncome().getTop() != null) {
				if (annualIncome >= taxSlab.getChargeableIncome().getBottom() &&
						annualIncome <= taxSlab.getChargeableIncome().getTop()) {
					response = taxSlab;
					break;
				}
			} else {
				response = taxSlab;
				break;
			}
		}
		return response;
	}
	
	// method for hardcoded taxSlab
	private void initialized() {
		List<TaxSlab> parameterList = new ArrayList<TaxSlab>();
		parameterList.add(categoryA);
		parameterList.add(categoryB);
		parameterList.add(categoryC);
		parameterList.add(categoryD);
		parameterList.add(categoryE);
		parameterList.add(categoryF);
		parameterList.add(categoryG);
		parameterList.add(categoryH);
		parameterList.add(categoryI);
		parameterList.add(categoryJ);
		this.setParameterList(parameterList);
		
	}

}
