class Hotel
{
	
	String name="A2B hotel";
	Owner owner=new Owner("Osama", 25, 'M');
	
	
	Hotel()
	{
		
	}
	
	public void assign()
	{
		System.out.println("Hotel Name :"+this.name);
		owner.display();
		
		
	}
	
	
	
	
}