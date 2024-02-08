package com.jacaranda.miPrimeraApi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;

public class StateDTO {
	
	private String codState;
	private String nameState;
	private List<TownDTO> listTown;
	
	
	
	public StateDTO(String codState, String nameState, List<TownDTO> listTown) {
		super();
		this.codState = codState;
		this.nameState = nameState;
		this.listTown = listTown;
	}
	
	public String getCodState() {
		return codState;
	}
	public void setCodState(String codState) {
		this.codState = codState;
	}
	public String getNameState() {
		return nameState;
	}
	public void setNameState(String nameState) {
		this.nameState = nameState;
	}
	public List<TownDTO> getListTown() {
		return listTown;
	}
	public void setListTown(List<TownDTO> listTown) {
		this.listTown = listTown;
	}
	
	public static List<StateDTO> getStateDto(List<State> listState) {
		List<StateDTO> statesDto = new ArrayList<StateDTO>();
		for (State state : listState) {
			List<TownDTO> townDto = new ArrayList<TownDTO>();
			for (Town town : state.getTowns()) {
				townDto.add(new TownDTO(town.getIdTown(), town.getName()));
			}
			statesDto.add(new StateDTO(state.getCodState(), state.getName(), townDto));
		}
		return statesDto;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(codState);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateDTO other = (StateDTO) obj;
		return Objects.equals(codState, other.codState);
	}
	
	
	
	

}
