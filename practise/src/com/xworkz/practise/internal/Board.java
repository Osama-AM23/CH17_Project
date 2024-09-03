package com.xworkz.practise.internal;

public class Board {

	private double width;
	private int height;

	protected Board() {
		System.out.println("Board with no Agrs");
	}

	public Board(double width, int height) {
		super();
		this.width = width;
		this.height = height;
		System.out.println("Board with double and int");
	}
	
	
}
