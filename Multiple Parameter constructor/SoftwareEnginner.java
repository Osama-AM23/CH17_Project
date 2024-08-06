class SoftwareEnginner
{
	
	String name;
	int experience;
	String designation;
	double salary;
	
	public SoftwareEnginner()
	{
		System.out.println("Creation the SoftwareEnginner eith no args");
		
	}
	
	public SoftwareEnginner(String name, int experience, String designation, double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		
	}
	
	public void display()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Experience :"+this.experience);
		System.out.println("Designation :"+ this.designation);
		System.out.println("Salary :"+ this.salary);
		
		
	}
	
	
}