package com.telstra.class1;

public class Tax {
	
	public  double calcTax(Employee emp)
	{
		double taxAmt=0.0;
		double grossSal = emp.calcSal();
		if (grossSal<30000) {
			taxAmt = grossSal*0.05;
		}
		else if (grossSal<60000) {
			taxAmt = grossSal*0.1;
		}
		else if (grossSal<100000) {
			taxAmt = grossSal*0.15;
		}
		else {
			taxAmt = grossSal*0.2;
		}
		
		return taxAmt;
	}

}