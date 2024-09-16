class Speaker
{
	
	String brand="Zebronic";
	char size;
	double cost;
	int output;
	
	public Speaker(int output)
	{
		this.output=output;
		
	}
	
	public void setSpeaker(char size)
	{
		this.size=size; 

	}
	public void print()
	{
		System.out.println("Brand :"+this.brand);
		System.out.println("Size :"+this.size);
		System.out.println("Cost :"+this.cost);
		System.out.println("Output :"+this.output);
		
	}
	
	
	
}