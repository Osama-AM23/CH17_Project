package com.xworkz.diffForms.DTO;

import java.io.Serializable;

public class ConcertDTO implements Serializable{
	
	private String location;
	private String artistName;
	private String ticketType;
	private int noOfTickets;
	
	
	public ConcertDTO() {
		System.out.println("No-Args Concert Dto");
	}


	public ConcertDTO(String location, String artistName, String ticketType, int noOfTickets) {
		super();
		this.location = location;
		this.artistName = artistName;
		this.ticketType = ticketType;
		this.noOfTickets = noOfTickets;
	}


	@Override
	public String toString() {
		return "ConcertDTO [location=" + location + ", artistName=" + artistName + ", ticketType=" + ticketType
				+ ", noOfTickets=" + noOfTickets + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + noOfTickets;
		result = prime * result + ((ticketType == null) ? 0 : ticketType.hashCode());
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
		ConcertDTO other = (ConcertDTO) obj;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfTickets != other.noOfTickets)
			return false;
		if (ticketType == null) {
			if (other.ticketType != null)
				return false;
		} else if (!ticketType.equals(other.ticketType))
			return false;
		return true;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getArtistName() {
		return artistName;
	}


	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}


	public String getTicketType() {
		return ticketType;
	}


	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}


	public int getNoOfTickets() {
		return noOfTickets;
	}


	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
	
	
	
}
