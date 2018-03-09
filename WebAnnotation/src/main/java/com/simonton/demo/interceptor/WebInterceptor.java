package com.simonton.demo.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.simonton.demo.common.Response;
import com.simonton.demo.common.ResponseCode;
import com.simonton.demo.exception.DemoException;

@Aspect
@Component
public class WebInterceptor {

	@Around(value="@annotation(com.simonton.demo.annotation.Web)")
	public Object around(ProceedingJoinPoint joinPoint) {
		ResponseCode code = null;
		try {
			return joinPoint.proceed();
		} catch (DemoException e) {
			code = e.getCode();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(new Response(code.getCode(), code.getMessage()));
	}
	
}
