package com.telstra.concurrency;

public class AddThread implements Runnable {
	private Thread t;
	private MathOperation m;
	
	public AddThread (MathOperation m, String threadName) {
		this.m = m;
		this.t = new Thread(this);
		this.t.setName(threadName);
		this.t.start();
	}
	
	@Override
	public void run() {
		m.add(10);		
	}

	
}
