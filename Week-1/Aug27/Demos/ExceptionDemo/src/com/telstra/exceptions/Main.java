package com.telstra.exceptions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result = 0.0;
		
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			
			result = n1/n2;

			//System.out.println(result);
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid cmd line arguments"+ e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid input format "+e.getMessage()); //to get just the message
			e.printStackTrace(); //To get the complete details
		}
		catch (ArithmeticException e) {
			System.out.println("Denominator is zero"+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception occurred");
		}
		
		finally {	//Always executed
			System.out.println(result);
		}
		
		
	}

}
