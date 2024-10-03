package com.xworkz.enumExamples.enums;

public enum SeatType {
	
	RECLINER(01), PREMIUM(05), EXECUTIVE(10);
	
	private int seatNo;
	
	private SeatType(int seatNo) {
		this.seatNo=seatNo;
	}
	
	public int getSeatNo() {
		return seatNo;
	}
}
