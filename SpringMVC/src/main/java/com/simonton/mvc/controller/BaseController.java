package com.simonton.mvc.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.simonton.mvc.common.Response;
import com.simonton.mvc.exception.DemoException;
import com.simonton.mvc.exception.MissException;

public class BaseController {

	@ExceptionHandler(DemoException.class)
	@ResponseBody
	public String handleDemoException(DemoException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(MissException.class)
	public String handleMissException(MissException ex) {
		if (ex.getCode() == null)
			return ex.getMessage();
		else
			return new Gson().toJson(new Response(ex.getCode()));
	}
}
