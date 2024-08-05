class SpeakerRunner
{
	
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker(12);
		speaker.setSpeaker('M');
		speaker.cost=500;
		speaker.print();
		System.out.println("----------");
		
		Speaker speaker1=new Speaker(15);
		speaker1.setSpeaker('S');
		speaker1.cost=300;
		speaker1.print();
		System.out.println("----------");
			
		Speaker speaker2=new Speaker(25);
		speaker2.setSpeaker('S');
		speaker2.cost=300;
		speaker2.print();
		
		
	}
	
	
	
	
}