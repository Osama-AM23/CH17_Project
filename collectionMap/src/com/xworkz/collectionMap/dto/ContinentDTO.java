package com.xworkz.collectionMap.dto;

import java.io.Serializable;
import java.util.List;

public class ContinentDTO implements Serializable {

	public String name;
	public String code;
	

	public ContinentDTO() {
		System.out.println("No-Args constructor of Continent DTO");
	}


	public ContinentDTO(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ContinentDTO other = (ContinentDTO) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ContinentDTO [name=" + name + ", code=" + code + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}

	
}