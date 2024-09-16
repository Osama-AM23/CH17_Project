class ChocolateRunner
{
	
	public static void main(String[] array)
	{
		
		Chocolate chocolate=new Chocolate('M');
		chocolate.setPrice(500);
		chocolate.flavour="Choco Silk";
		chocolate.display();
		System.out.println("----------");
		
		
		Chocolate chocolate1=new Chocolate('M');
		chocolate1.setPrice(450);
		chocolate1.flavour="Choco Brust";
		chocolate1.display();
		System.out.println("----------");
		
		Chocolate chocolate2=new Chocolate('M');
		chocolate2.setPrice(350);
		chocolate2.flavour="Heart Blush";
		chocolate2.display();
		System.out.println("----------");
		
	}
	
	
	
	
}