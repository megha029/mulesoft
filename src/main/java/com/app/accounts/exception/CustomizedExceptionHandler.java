package com.app.accounts.exception;

import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.accounts.model.Error;


@ControllerAdvice
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

	/*@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = BadRequestException.class)
	public ResponseEntity<Error> badRequest(BadRequestException ex) {
		return new ResponseEntity<Error>(new Error("400", ex.getMessage()), HttpStatus.BAD_REQUEST);
	}
*/
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Error> handleInternalError(Exception ex) {
		return new ResponseEntity<Error>(new Error("500", "Some Internal Error Occured"),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>(new Error("405", ex.getMessage()), HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>(new Error("406",ex.getMessage()), HttpStatus.NOT_ACCEPTABLE);
		//return super.handleHttpMediaTypeNotAcceptable(ex, headers, status, request);
	}
}
