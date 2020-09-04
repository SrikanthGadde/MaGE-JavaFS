package com.telstra.threads1;

public class ThreadClassB extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i<10 ; i++) {
			System.out.println(i + Thread.currentThread().getName());
			try {
				Thread.sleep(100);	//100ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
	}
	
}
