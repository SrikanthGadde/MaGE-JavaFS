package com.telstra.threads1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		
		ThreadClassA thA = new ThreadClassA();

		Thread t1 = new Thread(thA);
		t1.setName("A");
		t1.start();
		
		ThreadClassB t2 = new ThreadClassB();

		//Thread t2 = new Thread(thB); //not required as ThreadClassB extends Thread class
		t2.setName("B");
		t2.start();
		
	}

}
