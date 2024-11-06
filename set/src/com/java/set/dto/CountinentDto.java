package com.java.set.dto;



import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CountinentDto {
	
    private	String name;
    private int code;
    private List<CountryDto> countries;

}
