package com.telstra.exceptionsAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStreamClass {
	public void readInput() {
		
		try(		//try with resource block - automatically closes resources (finally block not required)
		InputStreamReader ir = new InputStreamReader(System.in);	//Get input from keyboard
		BufferedReader br = new BufferedReader(ir);					//Sends character at a time
		){
			System.out.println("Enter two integer values");
			String str1 = br.readLine();	//Checked exceptions (IO exception) -Compiler throws error
			String str2 = br.readLine();
			
			int result = Integer.parseInt(str1)/Integer.parseInt(str2);
			System.out.println(result);
		} catch (IOException e) {		//catched exception - compiler detects
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println("Invalid cmd line arguments"+ e.getMessage());
			e.printStackTrace(); //To get the complete details
		}
	}
	
	public int readInput1() throws IOException,ArithmeticException,NumberFormatException,ArrayIndexOutOfBoundsException {
		InputStreamReader ir = new InputStreamReader(System.in);	//Get input from keyboard
		BufferedReader br = new BufferedReader(ir);					//Sends character at a time
		
		System.out.println("Enter two integer values");
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int result = Integer.parseInt(str1)/Integer.parseInt(str2);
		//System.out.println(result);
		return result;
	}
}
