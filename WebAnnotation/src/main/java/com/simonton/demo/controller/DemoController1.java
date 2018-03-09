package com.simonton.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.simonton.demo.annotation.Web;
import com.simonton.demo.common.Response;
import com.simonton.demo.exception.DemoException;
import com.simonton.demo.service.IDemoService;

@RestController
public class DemoController1 {

	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("/demo/{requestParam}")
	public String demo(String requestParam) {
		return "demo done....";
	}
	
	@Web
	@RequestMapping("/web/demo")
	public String demoWeb() {
		return demoService.doDemo();
	}
	
	@RequestMapping("/demo")
	public String doSth() {
		try {
			return demoService.doSth();
		} catch(DemoException ex) {
			return JSON.toJSONString(new Response(ex.getCode().getCode(), ex.getCode().getMessage()));
		}
	}
	
	@RequestMapping("/dodemo")
	public String demo() {
		try {
			return demoService.demo();
		} catch(DemoException ex) {
			return JSON.toJSONString(new Response(ex.getCode().getCode(), ex.getCode().getMessage()));
		}
	}
	
}
