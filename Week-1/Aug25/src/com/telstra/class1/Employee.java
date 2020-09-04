package com.telstra.class1;

public class Employee {
	//protected stuff visible to all derived classes and also within the package
	protected int empId;
	protected String empName;
	protected int bSal;
	protected int grade;
	
	public Employee(int empId, String empName, int bSal, int grade) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.bSal = bSal;
		this.grade = grade;
	}

	public String getDetails() {
		return (empId+" "+empName+" "+bSal);
	}
	
	protected double calcSal() {
		return (bSal*(1+(grade*0.1)));
	}
}
