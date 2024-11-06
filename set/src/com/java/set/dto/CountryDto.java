package com.java.set.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class CountryDto {
	
	private String name;
	private int code;
	private PresidentDto presidentDto;
	
	

}
