package com.manipal.service;

import java.util.Map;

public interface ITemperatureConversionService {
	Map<String, Double> rate(String from, String to);
}
