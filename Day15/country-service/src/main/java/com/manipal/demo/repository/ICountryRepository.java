package com.manipal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.CountryDAO;

@Repository
public interface ICountryRepository extends JpaRepository<CountryDAO, String>{
	public CountryDAO getByCountryName(String countryName);
}
