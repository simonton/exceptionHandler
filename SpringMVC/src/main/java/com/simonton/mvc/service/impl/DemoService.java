package com.simonton.mvc.service.impl;

import org.springframework.stereotype.Service;

import com.simonton.mvc.common.num.ResponseCode;
import com.simonton.mvc.exception.DemoException;
import com.simonton.mvc.exception.MissException;
import com.simonton.mvc.service.IDemoService;

@Service
public class DemoService implements IDemoService {

	@Override
	public String doDemo() {
		boolean mockCondition = true;
		if (mockCondition) {
			throw new DemoException(" demo exception...");
		}
		return "demo...";
	}


	@Override
	public String doMiss() {
		boolean mockCondition = true;
		if (mockCondition) {
			throw new MissException(ResponseCode.FAILURE);
		}
		return "miss...";
	}

}
