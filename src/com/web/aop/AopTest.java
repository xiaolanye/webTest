package com.web.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTest {
	
	@Pointcut("execution(public void com.web.service.impl.TestServiceImpl.doTest())")
	public void aspect(){}

	@Before("aspect()")
	public void aopBefore() {
		System.out.println("@Before");
	}

	@After("aspect()")
	public void aopAfter() {
		System.out.println("@After");
	}

}
