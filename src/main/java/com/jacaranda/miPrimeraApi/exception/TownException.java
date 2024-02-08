package com.jacaranda.miPrimeraApi.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)//Hay que crear una exception para cada caso 
public class TownException extends RuntimeException {
	public TownException(String id) {
		super("No existe el pueblo con código "+id);
	}

	
}
