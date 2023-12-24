package com.example.taxcalculator.service.parameter;

import java.util.List;

public interface TaxParameterService<T> {
	
	public List<T> getAll();
	public void setParameterList(List<T> parameterList);

}
