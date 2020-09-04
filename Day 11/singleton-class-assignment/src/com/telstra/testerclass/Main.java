package com.telstra.testerclass;

import com.telstra.singletonclass.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton obj = Singleton.create();
		Singleton obj1 = Singleton.create();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
