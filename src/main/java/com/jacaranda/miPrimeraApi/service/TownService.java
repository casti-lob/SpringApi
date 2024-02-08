package com.jacaranda.miPrimeraApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.miPrimeraApi.model.Town;
import com.jacaranda.miPrimeraApi.model.TownDTO;
import com.jacaranda.miPrimeraApi.repository.TownRepository;

@Service
public class TownService {
	@Autowired
	private TownRepository townRepository;
	
	public TownDTO get (String id) {
		
		return TownDTO.get(townRepository.findById(id).orElse(null));
	}
	
	public List<TownDTO> getAll(){
		List<Town> listTown = this.townRepository.findAll();
		
		return TownDTO.getListTownDto(listTown);
	}
	
	public TownDTO delete (String id) {
		Town deleteTown = townRepository.findById(id).orElse(null);
		TownDTO town = TownDTO.get(deleteTown);
		if(deleteTown!= null) {
			townRepository.delete(deleteTown);
		}
		return town;
	}

}
