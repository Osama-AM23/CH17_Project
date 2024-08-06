class State
{
	
	String name;
	String language;
	
	CapitalCity capitalCity=new CapitalCity("Chennai", 12290000L);
	
	State(String name, String language)
	{
		this.name=name;
		this.language=language;
		
	}
	
	public void print()
	{
		
		System.out.println("State Name :"+this.name);
		System.out.println("State Language :"+this.language);
		this.capitalCity.print();
	}
	
	
	
	
	
}