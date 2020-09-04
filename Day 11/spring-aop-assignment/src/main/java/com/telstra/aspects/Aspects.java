package com.telstra.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Date;

@Aspect
public class Aspects {
	
	@Pointcut("execution(public * com.telstra.spring_core_demo.*.show*())")
	public void showPointcut() {}
	
	@Pointcut("execution(public * com.telstra.spring_core_demo.Welcome.get*())")
	public void showPointcutGet() {}
	
	
	//Use || to add more pointcuts
	@Before("showPointcut() || showPointcutGet()")
	public void showLogging() {
		System.out.println(new Date()+" Message is being accessed");
	}
	/*
	@Before("showPointcut()")		//create a Pointcut to reduce code duplicates
	public void showLogging2() {
		System.out.println(new Date()+" Message is being accessed by...");
	}
	*/
	
	@Before("showPointcutGet()")
	public void showLogging1() {
		System.out.println("GETTER");
	}
	
	@After("showPointcut()")
	public void showloggingAfter() {
		//System.out.println(new Date() + " Message is accessed");
	}
	
}
