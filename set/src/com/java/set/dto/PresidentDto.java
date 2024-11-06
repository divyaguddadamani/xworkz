package com.java.set.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
@EqualsAndHashCode
public class PresidentDto {
	
	private String name;
	private String primarywork;
	private int age;
	private AddressDto addressdto;

}
