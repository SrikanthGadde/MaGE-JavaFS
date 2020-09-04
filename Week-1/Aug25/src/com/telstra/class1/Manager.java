package com.telstra.class1;
//make sure class "is-a" extends 
public class Manager extends Employee{
	private String deptName;
	private int empCount;
	
	//consutructor chaining
	public Manager(int empId, String empName, int bSal, int grade, String deptName, int empCount) {
		super(empId, empName, bSal, grade);
		this.deptName = deptName;
		this.empCount = empCount;
	}
	
	//function overriding - dynamic polymorphism
	@Override
	public String getDetails() {
		return (super.getDetails() + " "+deptName+" "+empCount);
	}

	public String getDeptName() {
		return deptName;
	}

	public int getEmpCount() {
		return empCount;
	}
/*
	@Override
	protected double calcSal() {
		// TODO Auto-generated method stub
		return 0;
	}
	*/

	@Override
	protected double calcSal() {
		// TODO Auto-generated method stub
		return (bSal*(1+(grade*0.1)));
	}
}
