package com.xworkz.collectionLombok.dto;

import java.io.Serializable;

import com.xworkz.collectionLombok.constants.Address;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class MallDTO implements Serializable{
	
	private int id;
	private String name;
	private Address address;
	private String owner;
	private double landDimension;

}
