package com.telstra.assignments;

public class User {
	private int accno;
	private int bal;

	public User(int accno) {
		super();
		this.accno = accno;
		this.bal = 0;
	}
	
	public User(int accno, int bal) {
		super();
		this.accno = accno;
		this.bal = bal;
	}
	
	public void Withdraw(int x) {
		bal -= x;
	}
	
	public void Deposit(int x) {
		bal += x;
	}
	
	@Override
	public String toString() {
		return "Account Number=" + accno + ", Balance=" + bal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accno;
		result = prime * result + bal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;*/
		int other = (int) obj;
		if (accno != other)
			return false;
		//if (bal != other.bal)
			//return false;
		return true;
	}
	
}
