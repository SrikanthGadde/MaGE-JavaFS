package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.TemperatureCalculatorBean;
import com.manipal.proxy.TemperatureConversionProxy;

@RestController
public class TemperatureCalculatorController {
	/*
	@GetMapping("metric-calculator/from/{from}/to/{to}/unit/{unit}")
	public TemperatureCalculatorBean calculateUnit(@PathVariable String from, @PathVariable String to, @PathVariable int unit) {
		return new TemperatureCalculatorBean(1L, from, to, 0, unit, 0);
	}
	*/
	
	@Autowired
	TemperatureConversionProxy proxy;
	
	@GetMapping("temperature-calculator/from/{from}/to/{to}/unit/{unit}")
	public TemperatureCalculatorBean calculateUnit(@PathVariable String from, @PathVariable String to, @PathVariable int unit) {
		TemperatureCalculatorBean bean = proxy.retrieveCalculatedValue(from, to);
		double totalUnits = bean.getConversion().get("Multiplier")*unit+bean.getConversion().get("Adder");
		System.out.println(bean);
		return new TemperatureCalculatorBean(1L, from, to, bean.getConversion(), unit, totalUnits);
	}
	
}
