package com.simonton.demo.common;

public enum ResponseCode {

	SUCCESS("0000","成功"),
	FAILE("9999","失败"),
	PARAMETER_ILLEGAL("0001","请求参数非法");
	
	private String code;
	private String message;
	
	private ResponseCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

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
