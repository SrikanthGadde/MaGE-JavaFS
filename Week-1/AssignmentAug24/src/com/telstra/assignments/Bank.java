package com.telstra.assignments;

import java.util.Scanner;

import java.util.ArrayList;

public class Bank {
	
	public static void main(String[] args) {
		int lastAccountNumber = 0;
		
		boolean active = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<User> users = new ArrayList<User>();
		
		while (active) {	
			System.out.println("Enter 1 for creating a new account, 2 for accessing an existing account: ");
			int num = sc.nextInt();
			
			Boolean session = true;
			if (num == 1) {
				while(session) {
					User u = new User(lastAccountNumber++);
					users.add(u);
					System.out.println("Account created! "+u.toString());
					System.out.println("Enter 1 for operating on this account, 2 for terminating session: ");
					int nums = sc.nextInt();
					Boolean operating = true;
					if (nums==1) {
						while (operating) {
							System.out.println("Enter 1 for withdrawing, 2 for depositing, 3 for account details");
							int numu = sc.nextInt();
							if(numu==1) {
								System.out.println("Enter amount being withdrawn: ");
								int num1 = sc.nextInt();
								u.Withdraw(num1);
								System.out.println(u);
							}
							else if(numu == 2) {
								System.out.println("Enter amount being deposited: ");
								int num2 = sc.nextInt();
								u.Deposit(num2);
								System.out.println(u);
							}
							else if (numu ==3) {
								System.out.println(u);
							}
							else {
								System.out.println("Invalid input");
							}
							System.out.println("Do you want to continue operating on this account? (1 for yes)");
							int numc = sc.nextInt();
							if (numc == 1) {
								continue;
							}
							else {
								operating = false;
								session = false;
							}
						}
					}
					else {
						System.out.println("Session terminated");
						session = false;
					}					
				}
			}
			else if (num == 2) { //existing account
				System.out.println("Enter account number: ");
				int acc = sc.nextInt();
				Boolean flag = false;
				for (User i: users) {
					if (i.equals(acc)) {
						flag = true;
						System.out.println("Account found.");
						Boolean operating = true;
						while (operating) {
							System.out.println("Enter 1 for withdrawing, 2 for depositing, 3 for account details");
							int numu= sc.nextInt();
							if(numu==1) {
								System.out.println("Enter amount being withdrawn: ");
								int num1 = sc.nextInt();
								i.Withdraw(num1);
								System.out.println(i);
							}
							else if(numu == 2) {
								System.out.println("Enter amount being deposited: ");
								int num2 = sc.nextInt();
								i.Deposit(num2);
								System.out.println(i);
							}
							else if (numu ==3) {
								System.out.println(i);
							}
							else {
								System.out.println("Invalid input");
							}
							System.out.println("Do you want to continue operating on this account? (1 for yes)");
							int numc = sc.nextInt();
							if (numc == 1) {
								continue;
							}
							else {
								operating = false;
							}
						}
						break;
					}
					else {
						continue;
					}
				}
				if (flag==false) 
					System.out.println("Account not found.");
			}
			else {
				System.out.println("Closed");
				active = false;
			}
		}
	}
}
