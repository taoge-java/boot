/**
 * 
 */
package com.springboot.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author zengjintao
 * @version 1.0
 * @create_at 2017年9月27日下午8:00:23
 */
public class HttpAspect {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(HttpAspect.class);
	
	@Pointcut("execution(* com.springboot.controller.HelloController.*(..))")
	public void log(){
		ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request=attributes.getRequest();
		log.info("ugrl={}",request.getRequestURL());
		log.info("meoth={}",request.getMethod());
		log.info("ip={}",request.getRemoteAddr());
		//类方法
		//log.info("class_meoth={}",point.getSignature().getDeclaringTypeName()+"."+point.getSignature().getName());
		//log.info("ip={}",point.getArgs());
	}
	
	@Before("log()")
	public void before(){
		System.err.println("-----方法执行前-----");
	}
	@After("log()")
	public void after(){
		System.err.println("-----方法执行后-----");
	}
}
