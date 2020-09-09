package com.manipal.model;

import java.util.Map;

public class ConversionRate {
	private long id;
	private String from;
	private String to;
	private Map<String, Double> conversion;
	
	public ConversionRate() {}
	
	public ConversionRate(long id, String from, String to, Map<String, Double> conversion) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion = conversion;
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
	public Map<String, Double> getConversion() {
		return conversion;
	}
	public void setConversion(Map<String, Double> conversion) {
		this.conversion = conversion;
	}
	
	
}
