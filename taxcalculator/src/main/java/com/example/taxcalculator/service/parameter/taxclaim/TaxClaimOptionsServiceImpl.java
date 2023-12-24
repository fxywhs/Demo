package com.example.taxcalculator.service.parameter.taxclaim;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.taxcalculator.entity.taxclaimoptions.TaxClaimOptions;
import com.example.taxcalculator.service.parameter.TaxParameterServiceImpl;

@Service
public class TaxClaimOptionsServiceImpl extends TaxParameterServiceImpl<TaxClaimOptions> 
	implements TaxClaimOptionsService {

	public TaxClaimOptionsServiceImpl() {
		super();
		init();
	}

	private void init() {
		List<TaxClaimOptions> parameterList = new ArrayList<TaxClaimOptions>();
		parameterList.add(new TaxClaimOptions("Individual and dependent relatives", Double.valueOf(9000)));
		parameterList.add(new TaxClaimOptions("Medical Treatment", Double.valueOf(8000)));
		parameterList.add(new TaxClaimOptions("Purchase of basic supporting equipment for disabled self, spouse, child or parent", Double.valueOf(6000)));
		parameterList.add(new TaxClaimOptions("Disabled individual", Double.valueOf(6000)));
		parameterList.add(new TaxClaimOptions("Education fees (Self)", Double.valueOf(7000)));
		parameterList.add(new TaxClaimOptions("Medical expenses for family", Double.valueOf(10000)));
		parameterList.add(new TaxClaimOptions("Lifestyle", Double.valueOf(2500)));
		parameterList.add(new TaxClaimOptions("Lifestyle - additional", Double.valueOf(500)));
		this.setParameterList(parameterList);		
	}	

}
