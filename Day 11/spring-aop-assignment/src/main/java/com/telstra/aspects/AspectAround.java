package com.telstra.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectAround {
	@Around("execution (public * com.telstra.spring_core_demo.Welcome.show*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		//System.out.println("B E F O R E method call");
		
		Object obj = pjp.proceed();
		
		//System.out.println("A F T E R method call");
		//System.out.println(pjp.getKind());
		//System.out.println(pjp.getTarget());
		
		return obj;
	}
}
