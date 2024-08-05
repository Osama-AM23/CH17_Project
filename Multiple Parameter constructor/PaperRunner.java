class PaperRunner
{
	
	public static void main(String[] args)
	{
		
		Paper paper=new Paper("A4");
		paper.setPaper(true);
		paper.color="White";
		paper.display();
		System.out.println("----------");
		
		Paper paper1=new Paper("A5");
		paper1.setPaper(true);
		paper1.color="White";
		paper1.display();
		System.out.println("----------");
		
		Paper paper2=new Paper("A2");
		paper2.setPaper(true);
		paper2.color="Green";
		paper2.display();
		System.out.println("----------");
		
		
		
		
	}
	
	
	
	
	
}