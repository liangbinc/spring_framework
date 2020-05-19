package org.springframework.Bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {


	@Pointcut("execution(* org.springframework.Bean.*.*(..))")
	public void pointCut() {

	}

	@Before("org.springframework.Bean.AspectTest.pointCut()")
	public void doAccessCheck() {
		System.out.println("Before aop");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("======");
	}

}
