package com.manipal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.ConversionRate;

@Service
public class TemperatureConversionServiceImpl implements ITemperatureConversionService{
	
	@Override
	public Map<String, Double> rate(String from, String to) {
		Map<String, Double> conversion = new HashMap<>();
			if(from.equals("C")) {
				if(to.equals("F")) {
					conversion.put("Multiplier",1.8);
					conversion.put("Adder",32.0);
				}
				else if (to.equals("K")) {
					conversion.put("Multiplier",1.0);
					conversion.put("Adder",273.15);
				}
			}
			else if (from.equals("F")){
				if(to.equals("C")) {
					conversion.put("Multiplier",0.5555555555555556);
					conversion.put("Adder",-17.77777777777778);
				}
				else if(to.equals("K")) {
					conversion.put("Multiplier",0.5555555555555556);
					conversion.put("Adder",255.3722222222222);
				}
			}
			else if (from.equals("K")) {
				if (to.equals("C")) {
					conversion.put("Multiplier",1.0);
					conversion.put("Adder",-273.15);
				}
				else if (to.equals("F")) {
					conversion.put("Multiplier",1.8);
					conversion.put("Adder",-459.4);
				}
			}
		return conversion;
	}
	
}
