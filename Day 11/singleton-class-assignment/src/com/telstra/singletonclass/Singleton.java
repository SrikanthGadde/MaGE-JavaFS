package com.telstra.singletonclass;

public class Singleton {
	public static int count=0;
	private static Singleton object;

	private Singleton() {
		count++;
	}

	public static Singleton create() {
		if (count < 1) {
			object = new Singleton();
			return object;
		}
		return null;
	}
}
