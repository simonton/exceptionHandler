package com.simonton.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simonton.mvc.service.IDemoService;

@RestController
public class DemoController extends BaseController {

	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("/demo")
	public String demo() {
		return demoService.doDemo();
	}
	
	@RequestMapping("/miss")
	public String miss() {
		return demoService.doMiss();
	}
}
