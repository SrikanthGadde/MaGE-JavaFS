package com.telstra.spring_core_demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.telstra.model.Employee;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/spring.xml");	//also works with absolute path

		//Uncomment appropriate type of annotation based dependency in Employee.java
		//ln12 constructor method
		//ln42-43 setter method
		//ln47-48 custom method
		Employee emp = (Employee) context.getBean("employee1");
		System.out.println(emp.getEmpName() + "\t" + emp.getSalary() +"\t" +
				emp.getAddress().getCity() + "\t" + emp.getAddress().getPin());
		System.out.println(emp);
	}
}
