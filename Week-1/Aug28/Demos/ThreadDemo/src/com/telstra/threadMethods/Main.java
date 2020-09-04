package com.telstra.threadMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		
		ThreadClassA thA = new ThreadClassA();

		Thread t1 = new Thread(thA);
		//t1.setName("A");
		t1.setPriority(9);	//set priority for the thread
		t1.start();
		System.out.println(t1.getPriority());	//get priority of the corresponding object
		
		//Thread.yield();

		Thread t2 = new Thread(thA);
		//t2.setName("B");
		t2.setPriority(1);
		t2.start();
		
		Thread t3 = new Thread(thA);
		//t3.setName("B");
		t3.setPriority(Thread.MAX_PRIORITY);	//10
		t3.start();
		
		Thread t4 = new Thread(thA);
		//t4.setName("B");
		t4.setPriority(Thread.MIN_PRIORITY);	//1
		t4.start();
		
		Thread t5 = new Thread(thA);
		//t5.setName("B");
		//t5.setPriority(9);
		t5.start();
		
		//join() method
		try {
			t1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
