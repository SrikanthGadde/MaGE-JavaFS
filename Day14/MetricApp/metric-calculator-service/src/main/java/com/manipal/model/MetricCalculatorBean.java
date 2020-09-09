package com.manipal.model;

public class MetricCalculatorBean {
	private long id;
	private String from;
	private String to;
	private double conversionMultiple;
	private int units;
	private double totalUnits;
	int port;

	public MetricCalculatorBean() {}
	
	public MetricCalculatorBean( long id, String from, String to, double conversionMultiple, int units,
			double totalUnits, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.units = units;
		this.totalUnits = totalUnits;
		this.port = port;
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
	public double getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "MetricCalculatorBean [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", units=" + units + ", totalUnits=" + totalUnits + "]";
	}
	
	
	
}
