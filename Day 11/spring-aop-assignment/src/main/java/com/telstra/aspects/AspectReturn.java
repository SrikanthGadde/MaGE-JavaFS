package com.telstra.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class AspectReturn {
	@AfterReturning(pointcut="execution (public String com.telstra.spring_core_demo.Welcome.*())", 
			returning = "returnVal")
	public void returnAdvice(Object returnVal) {
		//System.out.println("A F T E R returing advice ---- return value is"+returnVal);
		//Logger logger = LoggerFactory.getLogger(AspectReturn.class );
		//logger.info("A F T E R return advice"+returnVal);
		
	}
}
