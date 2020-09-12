package com.manipal.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class CountryDAO {
	@Id
	@Column(name = "country_code")
	private String countryCode;
	@Column(name="country_name")
	private String countryName;
	@Column(name="capital_name")
	private String capitalName;
	@Column(name="zipcode")
	private String zipcode;
	
	public CountryDAO() {}
	
	public CountryDAO(String countryCode, String countryName, String capitalName, String zipcode) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.setCapitalName(capitalName);
		this.setZipcode(zipcode);
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
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
