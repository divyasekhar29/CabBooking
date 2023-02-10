package com.sprint1.CabBooking.advice;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sprint1.CabBooking.exception.EmptyInputException;


@ControllerAdvice	

public class MyControllerAdvice extends ResponseEntityExceptionHandler{
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException elementException)
	{
		return new  ResponseEntity<String>("No such value is present in DB, Please change your request",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<String> handleEmptyResultDataAccessException(EmptyResultDataAccessException elementException)
	{
		return new  ResponseEntity<String>("No such value is present in DB, Please change your request",HttpStatus.BAD_REQUEST);
	}
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		return new  ResponseEntity<Object>("Please change the Http method type",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInputException(EmptyInputException elementException)
	{
		return new  ResponseEntity<String>("Input field is empty, Please look into it",HttpStatus.BAD_REQUEST);
	}
	
	/*@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> handleNotFoundException(NotFoundException elementException)
	{
		return new  ResponseEntity<String>("Data not found,Please look into it",HttpStatus.BAD_REQUEST);
	}*/
	
	/*@ExceptionHandler(InvalidTypeIdException.class)
	public ResponseEntity<String> handleInvalidTypeIdException(InvalidTypeIdException elementException)
	{
		return new  ResponseEntity<String>("Id not found,Please look into it",HttpStatus.BAD_REQUEST);
	}*/

}
