package com.xworkz.signUpForms.DTO;

import java.io.Serializable;

public class SignUpDTO implements Serializable {

	private int userId;
	private String email;
	private String password;
	private String confirmPassword;

	public SignUpDTO() {
		System.out.println("No-Args constructor");
	}

	public SignUpDTO(int userId, String email, String password, String confirmPasword) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPasword;
	}

	@Override
	public String toString() {
		return "SignUpDTO [userId=" + userId + ", email=" + email + ", password=" + password + ", confirmPasword="
				+ confirmPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((confirmPassword == null) ? 0 : confirmPassword.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
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
		SignUpDTO other = (SignUpDTO) obj;
		if (confirmPassword == null) {
			if (other.confirmPassword != null)
				return false;
		} else if (!confirmPassword.equals(other.confirmPassword))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}
