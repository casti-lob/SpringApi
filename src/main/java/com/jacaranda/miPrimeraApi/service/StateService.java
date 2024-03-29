package com.jacaranda.miPrimeraApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.miPrimeraApi.model.State;
import com.jacaranda.miPrimeraApi.model.StateDTO;
import com.jacaranda.miPrimeraApi.model.Town;
import com.jacaranda.miPrimeraApi.model.TownDTO;
import com.jacaranda.miPrimeraApi.repository.StateRepository;

@Service
public class StateService {
	@Autowired
	private StateRepository stateRepository;
	
	public State get(String id) {
		return stateRepository.findById(id).orElse(null);
	}
	
	public State save(State state) {
		return stateRepository.save(state);
	}
	public List<StateDTO> getAll(){
		List<State> states= this.stateRepository.findAll();
		
		return StateDTO.getStateDto(states);
	}
	public State update(State state) {
		State result;
		if(this.get(state.getCodState())==null) {
			result = null;
		}else {
			result= this.save(state);
		}
		return result;
		
	}
	public boolean delete(String cod) {
		Boolean result=true;
		if(this.get(cod)==null) {
			result = false;
		}else {
			this.stateRepository.delete(this.get(cod));
		}
		return result;
	}

}
