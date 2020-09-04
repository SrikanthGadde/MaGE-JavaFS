package com.telstra.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.telstra.spring_core_demo.Sample;
import com.telstra.spring_core_demo.Welcome;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Welcome welcomeObj = (Welcome) context.getBean("welcome");
		Sample sampleobj = (Sample) context.getBean("sample");
		
		sampleobj.showSample();
		System.out.println(welcomeObj.getMessage());
		welcomeObj.showMessage();
		//welcomeObj.throwException();
	}

}
