package com.simonton.demo.exception;

import com.simonton.demo.common.ResponseCode;

public class DemoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1950333732256835289L;
	
	private ResponseCode code;
	
	public DemoException() {}

	public DemoException(ResponseCode code) {
		this.code = code;
	}
	
	public DemoException(String message) {
		super(message);
	}

	public ResponseCode getCode() {
		return code;
	}

	public void setCode(ResponseCode code) {
		this.code = code;
	}
}
