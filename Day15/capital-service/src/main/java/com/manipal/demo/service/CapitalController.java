package com.manipal.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.demo.repository.ICapitalRepository;

@RestController
public class CapitalController {
	
	@Autowired
	private Environment environment;
	@Autowired
	private ICapitalRepository repository;
	
	@GetMapping("capital-service/capital/{capitalName}")
	public Capital getCapitalDetailsWithCapitalName(@PathVariable String capitalName) {
		 //get zipcode, language, population, countryCode (PK) where capitalName
		Capital capital = repository.getByName(capitalName);
		capital.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return capital;
	}
	
	@GetMapping("capital-service/zipcode/{zipcode}")
	public Capital getCapitalDetailsWithZipcode(@PathVariable String zipcode) {
		//get capital_name, language, population, country_code where zipcode
		Capital capital = repository.getByZipcode(zipcode);
		capital.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return capital;
	}
	
}



/*

	public ConversionRate getConversionRate(@PathVariable String from, @PathVariable String to) {
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		double rate = service.rate(from, to);
		return new ConversionRate(1L, from, to, rate, port);
		//OR return new ConversionRate(1L,from,to,Don't care);

*/