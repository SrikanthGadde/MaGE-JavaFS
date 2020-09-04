package com.telstra.exceptions;

public class InsufficientLeaveException extends Exception { //extends Exception becomes a checked exception, use RuntimeException to make unchecked exception

	private static final long serialVersionUID = 1L;
	
	
	private String msgs;

	public InsufficientLeaveException(String msgs) {
		super();
		this.msgs = msgs;
	}
	
	public String getMessage() {
		return msgs;
	}
	
}
