package com.xworkz.stream.dataDto;

import java.io.Serializable;


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
public class EmailDto implements Serializable{

	private String From;
	private String To;
	private String Sub;
	private String Msg;
}
