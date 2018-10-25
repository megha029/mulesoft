package com.app.accounts.exception;

public class BadRequestException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1750511555877227836L;

	public BadRequestException(String message) {
		super(message);
	}

}
