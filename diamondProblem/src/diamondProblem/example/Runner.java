package diamondProblem.example;
//not supported in Java 

//Java does not support the multiple inheritance because of the diamond problem.
public class Runner extends RailwayStation,PoliceStation
{

	public static void main(String[] args) {
		
		Runner runner= new Runner();
		runner.display();// which display() method to call confused
	}

}
