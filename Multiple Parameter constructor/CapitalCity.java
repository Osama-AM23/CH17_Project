class CapitalCity
{
	
	String name;
	long population;
	
	CapitalCity()
	{
		
	}
	
	CapitalCity(String name, long population)
	{
		this.name=name;
		this.population=population;
		
	}
	
	public void print()
	{
		
		System.out.println("Capital City :"+this.name);
		System.out.println("Population :"+this.population);
		
	}
	
	
}