class RocketRunner
{
	
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket(50);
		rocket.setSpeed(150);
		rocket.noOfThrusters=25;
		rocket.display();
		System.out.println("----------");
		
		Rocket rocket1=new Rocket(70);
		rocket1.setSpeed(185);
		rocket1.noOfThrusters=38;
		rocket1.display();
		System.out.println("----------");
		
		Rocket rocket2=new Rocket(40);
		rocket2.setSpeed(100);
		rocket2.noOfThrusters=30;
		rocket2.display();
		
		
	}
	
	
	
}