package com.xworkz.stringExample.intrenal;

public class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {

		return 23;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
