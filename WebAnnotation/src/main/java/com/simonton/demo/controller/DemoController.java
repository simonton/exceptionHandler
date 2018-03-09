package com.simonton.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simonton.demo.annotation.Web;
import com.simonton.demo.service.IDemoService;

@RestController
public class DemoController {

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
	
	@Web
	@RequestMapping("/demo")
	public String doSth() {
		return demoService.doSth();
	}
	
	@Web
	@RequestMapping("/dodemo")
	public String demo() {
		return demoService.demo();
	}
	
}
