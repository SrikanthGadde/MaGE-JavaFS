package com.telstra.asssignment3;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of baby (weight, length): ");
		String str = sc.next();
		float weight = Float.parseFloat(str);
		String str1 = sc.next();
		float length = Float.parseFloat(str1);
		Baby b1 = new Baby(weight, length);
		System.out.println(b1.getStatus());
	}

}
