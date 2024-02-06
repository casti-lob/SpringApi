package com.jacaranda.miPrimeraApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.miPrimeraApi.exception.StateException;
import com.jacaranda.miPrimeraApi.model.State;
import com.jacaranda.miPrimeraApi.service.StateService;

@RestController
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@GetMapping("/state")
	public List<State> getAll(){
		return this.stateService.getAll();
	}
	@GetMapping("/state/{id}")
	public ResponseEntity<State> get(@PathVariable String id){
		if (this.stateService.get(id)==null) {
			//return ResponseEntity.notFound().build();
			//return new ResponseEntity("kkk",HttpStatus.NOT_FOUND);
			throw new StateException(id);
		}else {
			return ResponseEntity.ok(this.stateService.get(id)); 
		}
		
		
		
	}

}
