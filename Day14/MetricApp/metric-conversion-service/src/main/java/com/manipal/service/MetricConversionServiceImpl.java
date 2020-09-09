package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.ConversionRate;

@Service
public class MetricConversionServiceImpl implements IMetricConversionService{
	
	@Override
	public double rate(String from, String to) {
		if (from.equals("KM")) {
			if(to.equals("M"))
				return 0.001;
			else if(to.equals("CM"))
				return 0.00001;
		}
		else if (from.equals("M")) {
			if (to.equals("KM"))
				return 1000;
			else if (to.equals("CM"))
				return 0.01;
		}
		else if (from.equals("CM")) {
			if(to.equals("KM"))
				return 100000;
			else if (to.equals("M"))
				return 100;
		}
		return 0;
	}
	
}
