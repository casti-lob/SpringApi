package com.jacaranda.miPrimeraApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.miPrimeraApi.exception.ApiError;
import com.jacaranda.miPrimeraApi.exception.TownException;
import com.jacaranda.miPrimeraApi.model.TownDTO;
import com.jacaranda.miPrimeraApi.service.TownService;

@RestController
public class TownController {
	@Autowired
	private TownService townService;
	
	@GetMapping("/town")
	public List<TownDTO> getAll(){
		return this.townService.getAll();
	}
	
	@GetMapping("/town/{id}")
	public ResponseEntity<TownDTO> get(@PathVariable String id){
		if(this.townService.get(id)==null) {
			throw new TownException(id);
		}else {
			return ResponseEntity.ok(this.townService.get(id));
		}
		
	}
	
	@DeleteMapping("town/{id}")
	public ResponseEntity<TownDTO> delete(@PathVariable String id){
		if(this.townService.delete(id)==null) {
			throw new TownException(id);
		}else {
			return ResponseEntity.ok(this.townService.get(id));
		}
	}
	
	
}
