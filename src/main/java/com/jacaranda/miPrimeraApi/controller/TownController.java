package com.jacaranda.miPrimeraApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
		
	}
}
