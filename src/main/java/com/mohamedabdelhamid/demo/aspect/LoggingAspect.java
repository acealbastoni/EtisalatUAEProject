package com.mohamedabdelhamid.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


	@Before("execution(* com.mohamedabdelhamid.demo.service.EmployeeService.*(..))")
	public void logRequest() {
		logger.info("Received a request");
	}

	
	 @AfterReturning(pointcut = "execution(* com.mohamedabdelhamid.demo.service.EmployeeService.*(..))", returning = "result")
	public void logResponse(Object result) {
		logger.info("Returning response: {}", result);
	}
}
