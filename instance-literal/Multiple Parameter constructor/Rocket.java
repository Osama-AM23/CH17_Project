class Rocket
{
	
	String country="India";
	int speed;
	double fuelCapacity;
	int noOfThrusters;
	
	public Rocket(double fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
		
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
		
	}
	
	public void display()
	{
		System.out.println("Country :"+ this.country);
		System.out.println("Speed :"+this.speed);
		System.out.println("Fuel Capacity :"+this.fuelCapacity);
		System.out.println("No Of Thrusters :"+this.noOfThrusters);
		
	}
	
	
	
}