package com.simonton.mvc.common.num;

public enum ResponseCode {

	SUCCESS("0000", "成功"),
	FAILURE("9999","失败");
	private String code;
	private String message;
	
	private ResponseCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
