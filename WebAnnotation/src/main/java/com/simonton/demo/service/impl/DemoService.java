package com.simonton.demo.service.impl;

import org.springframework.stereotype.Service;

import com.simonton.demo.common.ResponseCode;
import com.simonton.demo.exception.DemoException;
import com.simonton.demo.service.IDemoService;

@Service
public class DemoService implements IDemoService {

	@Override
	public String doDemo(){
		boolean mockCondition = true;
		doBusiness();
		if (mockCondition) {
			throw new DemoException(ResponseCode.PARAMETER_ILLEGAL);
		}
		return "demo response...";
	}

	@Override
	public String demo() {
		boolean mockCondition = true;
		doBusiness();
		if (mockCondition) {
			throw new DemoException(ResponseCode.PARAMETER_ILLEGAL);
		}
		return "demo response...";
	}

	@Override
	public String doSth() {
		boolean mockCondition = true;
		doBusiness();
		if (mockCondition) {
			throw new DemoException(ResponseCode.PARAMETER_ILLEGAL);
		}
		return "demo response...";
	}
	
	public void doBusiness() {
		System.out.println("do business...");
	}

}
