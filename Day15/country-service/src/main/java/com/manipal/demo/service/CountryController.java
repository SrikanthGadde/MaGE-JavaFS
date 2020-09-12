package com.manipal.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.demo.model.CountryDAO;
import com.manipal.demo.proxy.CapitalProxy;
import com.manipal.demo.repository.ICountryRepository;

@RestController
public class CountryController {
	
	@Autowired
	CapitalProxy proxy;
	@Autowired
	ICountryRepository repository;
	
	@GetMapping("country-service/country/{countryName}")
	public Country getCountryDetails(@PathVariable String countryName) {
		CountryDAO dao = repository.getByCountryName(countryName);
		Capital capital = proxy.getCapitalWithCapitalName(dao.getCapitalName());
		Country country = new Country();
		country.setCountryName(countryName);
		country.setCountryCode(dao.getCountryCode());
		country.setCapital(capital);
		return country;
	}
	
}
