package com.telstra.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectThrowing {
	@AfterThrowing(pointcut="execution (public * com.telstra.spring_core_demo.Welcome.*())")
	public void throwAdvice(JoinPoint point) {
		//System.out.println("A F T E R throwing advice ---- return value is"+point.getKind());

	}
}
