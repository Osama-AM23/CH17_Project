package com.xworkz.partialAbstraction.internal;

// Partial abstraction in Java can be using abstract classes. 
//An abstract class can contain both abstract methods (which must be implemented by subclasses)
//concrete methods (which have an implementation)
public abstract class Laptop {

	// abstract method -----> No Implementation
	public abstract void playGames();

	// Concrete method ----> with Implementation
	public void study() {
		System.out.println("Execute Study in Laptop");
	}

}
