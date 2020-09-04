package com.telstra.exceptions;

public class Employee {
	
	private int eid;
	private int balLeaves;
	
	public Employee(int eid, int balLeaves) {
		super();
		this.eid = eid;
		this.balLeaves = balLeaves;
	}
	
	public String applyLeave(int leave) throws InsufficientLeaveException {
		
		if (balLeaves<leave) {
			throw new InsufficientLeaveException("Leave cannot be sanctioned. Insufficient leaves available");
		}
		else {
			balLeaves-=leave;
			return "Leave sanctioned successfully";
		}
		
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", balLeaves=" + balLeaves + "]";
	}
	
	
}