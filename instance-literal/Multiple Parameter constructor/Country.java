class Country
{
	
	String countryName;
	String continent;
	
	State state=new State("Tamil Nadu", "Tamil");
	
	Country(String countryName, String continent)
	{
		this.countryName=countryName;
		this.continent=continent;
		
	}
	
	public void print()
	{
		System.out.println("Country Name :"+this.countryName);
		System.out.println("Continent :"+this.continent);
		this.state.print();
		
		
		
	}
	
	
	
}