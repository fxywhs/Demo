package com.example.taxcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.example.taxcalculator.entity","com.example.taxcalculator.service","com.example.taxcalculator.controller"})
public class TaxcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxcalculatorApplication.class, args);
	}

}
