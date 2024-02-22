package com.mohamedabdelhamid.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* com.example..*.controller.*.*(..))")
	public void logRequest() {
		logger.info("Received a request");
	}

	@AfterReturning(pointcut = "execution(* com.example..*.controller.*.*(..))", returning = "result")
	public void logResponse(Object result) {
		logger.info("Returning response: {}", result);
	}
}
