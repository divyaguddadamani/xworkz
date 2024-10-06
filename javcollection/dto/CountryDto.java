package com.java.javcollection.dto;

import java.io.Serializable;

import com.java.javcollection.dto.constants.Code;
import com.java.javcollection.dto.constants.Continent;

public class CountryDto<N,P,PN> {
	
	N name;
	Code code;
	P population;
	PN presidentName;
    Continent continent;
    
    public CountryDto() {
		System.out.println("no arg const");
	}

	public CountryDto(N name, Code code, P population, PN presidentName, Continent continent) {
		super();
		this.name = name;
		this.code = code;
		this.population = population;
		this.presidentName = presidentName;
		this.continent = continent;
	}

	public N getName() {
		return name;
	}

	public Code getCode() {
		return code;
	}

	public P getPopulation() {
		return population;
	}

	public PN getPresidentName() {
		return presidentName;
	}

	public Continent getContinent() {
		return continent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CountryDto))
			return false;
		CountryDto other = (CountryDto) obj;
		if (code != other.code)
			return false;
		if (continent != other.continent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryDto [name=" + name + ", code=" + code + ", population=" + population + ", presidentName="
				+ presidentName + ", continent=" + continent + "]";
	}
    
    
	
	
	

}
