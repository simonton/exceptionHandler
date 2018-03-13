package com.simonton.mvc.common;

import com.simonton.mvc.common.num.ResponseCode;

public class Response {

	private String code;
	
	public Response(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public Response(ResponseCode code) {
		this.code = code.getCode();
		this.message = code.getMessage();
	}
	
	public Response() {
		super();
	}

	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
