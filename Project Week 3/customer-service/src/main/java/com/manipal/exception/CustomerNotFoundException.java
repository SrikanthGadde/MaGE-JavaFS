package com.manipal.exception;

public class CustomerNotFoundException extends RuntimeException {
	
	public CustomerNotFoundException(int id) {
		super("Customer with ID "+id+" was not found." );
	}
	
}
