package com.telstra.exceptions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(7823, 12);
		
		try {
			System.out.println(e.applyLeave(10));
		} catch (InsufficientLeaveException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			System.out.println(e.applyLeave(4));
		} catch (InsufficientLeaveException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
	}

}
