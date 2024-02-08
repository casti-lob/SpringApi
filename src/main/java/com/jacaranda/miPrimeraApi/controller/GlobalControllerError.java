package com.jacaranda.miPrimeraApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jacaranda.miPrimeraApi.exception.ApiError;
import com.jacaranda.miPrimeraApi.exception.TownException;

@RestControllerAdvice
public class GlobalControllerError { 
	@ExceptionHandler(TownException.class)
		public ResponseEntity<ApiError> handleElementNotFoundException(TownException e){
			ApiError apiError = new ApiError(HttpStatus.NOT_FOUND,
			e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
		}
}

