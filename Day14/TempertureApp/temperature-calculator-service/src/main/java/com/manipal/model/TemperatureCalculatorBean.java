package com.manipal.model;

import java.util.Map;

public class TemperatureCalculatorBean {
	private long id;
	private String from;
	private String to;
	private Map<String,Double> conversion;
	private int units;
	private double totalUnits;
	
	public TemperatureCalculatorBean() {}
	
	public TemperatureCalculatorBean(long id, String from, String to, Map<String,Double> conversion, int units,
			double totalUnits) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion = conversion;
		this.units = units;
		this.totalUnits = totalUnits;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Map<String,Double> getConversion() {
		return conversion;
	}
	public void setConversion(Map<String,Double> conversion) {
		this.conversion = conversion;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getTotalUnits() {
		return totalUnits;
	}
	public void setTotalUnits(double totalUnits) {
		this.totalUnits = totalUnits;
	}

	@Override
	public String toString() {
		return "TemperatureCalculatorBean [id=" + id + ", from=" + from + ", to=" + to + ", conversion="
				+ conversion + ", units=" + units + ", totalUnits=" + totalUnits + "]";
	}
	
	
	
}
