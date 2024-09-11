package com.xworkz.example.internal;
//example  of Static Import 
//calling of predefined methods
//with static import
import static java.lang.System.*;
import static java.lang.Math.*;

public class Specs {
	public static void main(String[] args) {

        // calling static member of System class
        // directly without System class name
		out.println("Execute the main method");
		out.println("Lenskart");
		out.println(sqrt(80));
	}

}
