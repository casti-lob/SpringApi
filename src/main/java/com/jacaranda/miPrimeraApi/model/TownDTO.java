package com.jacaranda.miPrimeraApi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TownDTO {
	private String idTown;
	private String nameTown;
	
	public TownDTO(String idTown, String nameTown) {
		super();
		this.idTown = idTown;
		this.nameTown = nameTown;
	}

	public String getIdTown() {
		return idTown;
	}

	public void setIdTown(String idTown) {
		this.idTown = idTown;
	}

	public String getNameTown() {
		return nameTown;
	}

	public void setNameTown(String nameTown) {
		this.nameTown = nameTown;
	}
	
	public static List<TownDTO> getListTownDto(List<Town> listTown){
		List<TownDTO> listTownDto = new ArrayList<TownDTO>();
		for (Town town : listTown) {
			listTownDto.add(new TownDTO(town.getIdTown(), town.getName()));
		}
		return listTownDto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTown);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TownDTO other = (TownDTO) obj;
		return Objects.equals(idTown, other.idTown);
	}
	
	
	
}
