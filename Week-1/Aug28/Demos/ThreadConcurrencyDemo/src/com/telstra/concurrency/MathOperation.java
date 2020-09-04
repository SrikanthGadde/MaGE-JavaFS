package com.telstra.concurrency;

public class MathOperation {
	private int i=0;
	
	public synchronized void add(int num) {
		//synchronizes the variables
		this.notify();	//notifies the other thread to continue operation

		i += num;
		System.out.println("Value of i after addition: "+i);
	}
	
	public synchronized void sub(int num) {
		if (i<=0) {
			try {
				this.wait(); //wait for the other thread to release the resources
				//this.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		i -= num;
		System.out.println("Value of i after subtraction: "+i);
	}
	
}
