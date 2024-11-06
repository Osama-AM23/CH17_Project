package com.xworkz.collectionMap.dto;

import java.io.Serializable;

public class PresidentDTO implements Serializable {

	private String name;
	private String primaryWork;
	private int age;

	public PresidentDTO() {
		System.out.println("No-Args Construtor of PresidentDTO");
	}

	public PresidentDTO(String name, String primaryWork, int age) {
		super();
		this.name = name;
		this.primaryWork = primaryWork;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((primaryWork == null) ? 0 : primaryWork.hashCode());
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
		PresidentDTO other = (PresidentDTO) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (primaryWork == null) {
			if (other.primaryWork != null)
				return false;
		} else if (!primaryWork.equals(other.primaryWork))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PresidentDTO [name=" + name + ", primaryWork=" + primaryWork + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryWork() {
		return primaryWork;
	}

	public void setPrimaryWork(String primaryWork) {
		this.primaryWork = primaryWork;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
