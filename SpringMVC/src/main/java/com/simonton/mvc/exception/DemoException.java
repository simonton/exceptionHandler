package com.simonton.mvc.exception;

public class DemoException extends RuntimeException{

	private static final long serialVersionUID = -2962213773351243154L;

	public DemoException() {}
	
	public DemoException(String message) {
		super(message);
	}
	
}
