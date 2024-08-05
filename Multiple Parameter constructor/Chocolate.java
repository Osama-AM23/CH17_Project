class Chocolate
{
	
	String brand="Cadberry";
	double price;
	String flavour;
	char size;
	
	public Chocolate(char size)
	{
		
		this.size=size;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
		
	}
	
	public void display()
	{
		
		System.out.println("Brand :"+this.brand);
		System.out.println("Price :"+this.price);
		System.out.println("Flavour :"+this.flavour);
		System.out.println("Size :"+this.size);
		
	}
	
}