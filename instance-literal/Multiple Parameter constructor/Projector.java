class Projector
{
	String company="Epson";
	String type;
	String color;
	int weight;
	
	public Projector(int weight)
	{
		this.weight=weight;
		
	}
	
	public void setProjector(String type)
	{
		this.type=type;
		
	}

	public void display()
	{
		
		System.out.println("Company :"+ this.company);
		System.out.println("Type :"+ this.type);
		System.out.println("Color :"+ this.color);
		System.out.println("Weight"+ this.weight);
		
		
		
		
	}



}