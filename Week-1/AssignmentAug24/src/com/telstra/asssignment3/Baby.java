package com.telstra.asssignment3;

public class Baby {
	private float weight;
	private float length;
	private String status;
	
	public Baby(float weight, float length) {
		super();
		this.weight = weight;
		this.length = length;
		this.status = this.getReport();
	}
	
	public String getReport() {
		if((weight<3.2F) || (length<49.1F)) {
			status = "Undernourished";
		}
		else if ((weight>3.3F) || (length>49.9F)){
			status = "Overnourished";
		}
		else {
			status = "Healthy";
		}
		return status;
	}

	public String getStatus() {
		return this.status;
	}
	@Override
	public String toString() {
		return "Baby [weight=" + weight + ", length=" + length + ", status=" + status + "]";
	}
	
	
	
	
}
