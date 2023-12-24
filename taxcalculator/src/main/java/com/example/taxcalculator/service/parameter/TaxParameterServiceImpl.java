package com.example.taxcalculator.service.parameter;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaxParameterServiceImpl<T> implements TaxParameterService<T> {
	
	private List<T> parameterList; 

	@Override
	public List<T> getAll() {
		return parameterList;
	}

	@Override
	public void setParameterList(List<T> parameterList) {
		this.parameterList = parameterList;		
	}	

}
