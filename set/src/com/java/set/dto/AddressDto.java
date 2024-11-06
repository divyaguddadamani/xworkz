package com.java.set.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class AddressDto {
	private long no;
	private String street;
	private String city;
	private String state;
	private CountryDto countrydto;

}
