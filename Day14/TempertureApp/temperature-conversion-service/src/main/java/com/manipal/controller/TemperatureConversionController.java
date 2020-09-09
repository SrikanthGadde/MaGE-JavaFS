package com.manipal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.ConversionRate;
import com.manipal.service.TemperatureConversionServiceImpl;

@RestController 
public class TemperatureConversionController {
	
	@Autowired
	TemperatureConversionServiceImpl service;
	
	@GetMapping("temperature-conversion/from/{from}/to/{to}")
	public ConversionRate getConversionRate(@PathVariable String from, @PathVariable String to) {
		Map<String,Double> conversion = service.rate(from, to);
		return new ConversionRate(1L, from, to, conversion);
	}
	
}
