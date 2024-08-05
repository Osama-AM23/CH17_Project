class Paper
{
	double thickness=1.1;
	String size;
	boolean quality;
	String color;
	
	public Paper(String size)
	{
		
		this.size=size;
		
	}
	
	public void setPaper(boolean quality)
	{
		this.quality=quality;
		
	}
	public void display()
	{
		System.out.println("Thickness :"+this.thickness);
		System.out.println("Size :"+ this.size);
		System.out.println("Quality :"+this.quality);
		System.out.println("Color :"+this.color);
	}
	
	
	
}