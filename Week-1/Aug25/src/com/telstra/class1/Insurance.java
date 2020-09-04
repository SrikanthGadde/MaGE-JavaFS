package com.telstra.class1;

public class Insurance {

	public  double calcIns(Employee emp)
	{
		double insAmt=0.0;
		if (emp instanceof Manager) {
			if (emp.grade == 1) {
				insAmt = 700000;
			}
			else if (emp.grade == 2) {
				insAmt = 800000;
			}
		}
		else if (emp instanceof Intern) {
			if (emp.grade == 1) {
				insAmt = 100000;
			}
			else if (emp.grade == 2) {
				insAmt = 200000;
			}
		}
		else {
			if (emp.grade == 1) {
				insAmt = 300000;
			}
			else if (emp.grade == 2) {
				insAmt = 500000;
			}
		}
		return insAmt;
	}
	
}
