package com.manipal.exception;

public class TelephoneNotFoundException extends RuntimeException {
	
	public TelephoneNotFoundException(int id) {
		super("Telephone with ID "+id+" was not found");
	}
	
}
