package com.telstra.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private long empId;
	private String empName;
	private double salary;
	private Address address;
	private Address altAddress;
	
	@Autowired //no need to specify the address part in the bean declaration (in the configuration metadata) 
	//automatically injects address bean from the configuration metadata, only one such bean should exist
	public Employee(long empId, String empName, double salary,@Qualifier("address1") Address address,@Qualifier("address2") Address altAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.altAddress =altAddress;
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	//@Autowired //make sure you select an address for the constructor in the configuration metadata
	//@Qualifier("address2") 
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAltAddress() {
		return altAddress;
	}
	public void setAltAddress(Address altAddress) {
		this.altAddress=altAddress;
	}
	
	//@Autowired	//make sure you select an address for the constructor in the configuration metadata
	//@Qualifier("address2") //the below method will be executed right after the constructor method
	public void provideAddress(Address address1, Address address2) {
		 this.address = address1;	 
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address="
				+ address + ", altAddress=" + altAddress+"]";
	}
	
	
}
