class ProjectorRunner
{
	
	public static void main(String[] args)
	{
		
		Projector projector=new Projector(2);
		projector.setProjector("DLP");
		projector.color="White";
		projector.display();
		System.out.println("----------");
		
		Projector projector1=new Projector(3);
		projector1.setProjector("LCD");
		projector1.color="White";
		projector1.display();
		System.out.println("----------");
		
		Projector projector2=new Projector(2);
		projector2.setProjector("LED");
		projector2.color="Black";
		projector2.display();
		System.out.println("----------");
	}
	
	
	
	
	
}