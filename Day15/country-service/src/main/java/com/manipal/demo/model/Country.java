package com.manipal.demo.model;

public class Country {
	private String countryCode;
	private String countryName;
	private Capital capital;
	
	public Country() {}
	
	public Country(String countryCode, String countryName, Capital capital) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.capital = capital;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	
	
	
}
