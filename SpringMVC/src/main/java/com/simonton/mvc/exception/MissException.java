package com.simonton.mvc.exception;

import com.simonton.mvc.common.num.ResponseCode;

public class MissException extends RuntimeException {

	private static final long serialVersionUID = 9052893078168734022L;
	
	private ResponseCode code;

	public MissException() {}
	
	public MissException(String msg) {
		super(msg);
	}
	
	public MissException(ResponseCode code) {
		this.code = code;
	}

	public ResponseCode getCode() {
		return code;
	}

	public void setCode(ResponseCode code) {
		this.code = code;
	}
}
