package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.ConversionRate;
import com.manipal.service.MetricConversionServiceImpl;

@RestController
public class MetricConversionController {
	
	@Autowired
	MetricConversionServiceImpl service;
	private Environment environment;
	
	@GetMapping("metric-conversion/from/{from}/to/{to}")
	public ConversionRate getConversionRate(@PathVariable String from, @PathVariable String to) {
		int port = 8000; /*Integer.parseInt(environment.getProperty("local.server.port"));*/
		double rate = service.rate(from, to);
		return new ConversionRate(1L, from, to, rate, port);
		//OR return new ConversionRate(1L,from,to,Don't care);
	}	
	
}
