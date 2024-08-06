class Company
{
	
	int id;
	String name;
	String location;
	
	SoftwareEnginner softwareenginner= new SoftwareEnginner("Osama", 1, "Developer", 40000);
	
	Company(int id, String name, String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
		
	}
	
	public void display()
	{
		System.out.println("Company ID :"+this.id);
		System.out.println("Company Name :"+this.name);
		System.out.println("Company Location :"+this.location);
		this.softwareenginner.display();
		
		
		
		
	}
	
	
}