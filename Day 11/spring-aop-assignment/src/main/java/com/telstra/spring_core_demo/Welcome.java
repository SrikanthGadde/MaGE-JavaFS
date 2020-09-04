package com.telstra.spring_core_demo;

public class Welcome {
	private String message;

	public Welcome() {}
	
	public Welcome(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void showMessage() {
		System.out.println(message);
	}
	
	public void throwException() {
		throw new RuntimeException();
	}
	
}
