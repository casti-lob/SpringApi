package com.jacaranda.miPrimeraApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StateException extends RuntimeException {
	
	public StateException(String id) {
		super("No existe una provincia con código "+id);
	}
}
