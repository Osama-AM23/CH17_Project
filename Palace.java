class Palace
{
	
	 public static void main(String[] veg) 
	 {
	
	if(veg.length==4)
		{
			String name=veg[0];
			String location=veg[1];
			String buildby=veg[2];
			String buildYear=veg[3];
			
			System.out.println("Name:"+name);
			
			System.out.println("Location:"+location);
			
			System.out.println("Build By:"+buildby);
			
			System.out.println("Build Year:"+buildYear);
		}	
		else {
			System.out.println("least 4 reference needed");
		}
	 }		
	
}