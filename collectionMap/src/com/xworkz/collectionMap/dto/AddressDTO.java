package com.xworkz.collectionMap.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable {

	private int doorNo;
	private String street;
	private String state;
	

	public AddressDTO() {
		System.out.println("No-Args Constructor of AddressDTO");
	}

	public AddressDTO(int doorNo, String street, String state) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.state = state;
		
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + doorNo;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressDTO other = (AddressDTO) obj;
		if (doorNo != other.doorNo)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "AddressDTO [doorNo=" + doorNo + ", street=" + street + ", state=" + state + "]";
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
