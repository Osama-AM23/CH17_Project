class ChargerRunner
{
	public static void main(String[] args)
	{
		Charger charger=new Charger();
		int watt=charger.chargerWatt;
		String brand=charger.chargerBrand;
		String color=charger.color;
		
		System.out.println("Charger Watt:"+watt);
		System.out.println("Brand:"+brand);
		System.out.println("color:"+color);
		
		Charger charger1=new Charger();
		int watts=charger.chargerWatt;
		String logo=charger.chargerBrand;
		String clour=charger.color;
		
		charger.chargerWatt=100;
		charger.chargerBrand="flash wolt";
		String ref=charger.color;
		
		System.out.println("Watt:"+charger.chargerWatt);
		System.out.println("Brand:"+charger.chargerBrand);
		System.out.println("color:"+charger.color);
		System.out.println("================");
		
		clawClip clawclip= new clawClip();
		String clip=clawclip.name;
		int qty=clawclip.quantity;
		double cost=clawclip.price;
		
		System.out.println("Name: "+clawclip.name);
		System.out.println("quantity: "+clawclip.quantity);
		System.out.println("price: "+clawclip.price);
		
		clawClip clawclip1= new clawClip();
		String clips=clawclip.name;
		int quty=clawclip.quantity;
		double prc=clawclip.price;
		
		String per=clawclip.name;
		clawclip.quantity=5;
		clawclip.price=25;
		
		System.out.println("name:"+clawclip.name);
		System.out.println("Quantity: "+clawclip.quantity);
		System.out.println("Price: "+clawclip.price);
		System.out.println("================");
		
		crow crow=new crow();
		int weight=crow.weight;
		int speed=crow.speed;
		int length=crow.length;
		
		System.out.println("Weight:"+crow.weight);
		System.out.println("Speed:"+crow.speed);
		System.out.println("Length:"+crow.length);
		
		crow.weight=2;
		crow.speed=72;
		int val=crow.length;
		
		System.out.println("Weight:"+crow.weight);
		System.out.println("Speed:"+crow.speed);
		System.out.println("Length:"+crow.length);
		System.out.println("================");
		
		Clock clock=new Clock();
		String shape= clock.shape;
		double prs=clock.mrp;
		int wrty=clock.warranty;
		
		System.out.println("Shape:"+clock.shape);
		System.out.println("Price:"+clock.mrp);
		System.out.println("Warranty:"+clock.warranty);
		
		clock.shape="circle";
		clock.mrp=560;
		int wty=clock.warranty;
		
		System.out.println("Shape:"+clock.shape);
		System.out.println("Price:"+clock.mrp);
		System.out.println("Warranty:"+clock.warranty);
		System.out.println("================");
		
		Lolipop lolipop=new Lolipop();
		String productBy=lolipop.productBy;
		double popPrice=lolipop.popPrice;
		String mfgDate=lolipop.mfgDate;
		
		System.out.println("Brand :"+lolipop.productBy);
		System.out.println("Price :"+lolipop.popPrice);
		System.out.println("MFG Date:"+lolipop.mfgDate);
		
		String product=lolipop.productBy;
		lolipop.popPrice=10;
		lolipop.mfgDate="09 oct";
		
		System.out.println("Brand :"+lolipop.productBy);
		System.out.println("Price :"+lolipop.popPrice);
		System.out.println("MFG Date:"+lolipop.mfgDate);
		System.out.println("================");
		
		Jean jean= new Jean();
		String type=jean.type;
		double fixedCost=jean.fixedCost;
		int size=jean.size;
		
		System.out.println("Type: "+jean.type);
		System.out.println("Price: "+jean.fixedCost);
		System.out.println("Size: "+jean.size);
		
		jean.type="cotton";
		double fixedPrice=jean.fixedCost;
		jean.size=32;
		
		System.out.println("Type: "+jean.type);
		System.out.println("Price: "+jean.fixedCost);
		System.out.println("Size: "+jean.size);
		System.out.println("================");
		
		KeyBoard keyboard= new KeyBoard();
		String company=keyboard.company;
		String types=keyboard.types;
		int gauranty=keyboard.gauranty;
		
		System.out.println("Brand: "+keyboard.company);
		System.out.println("Types: "+keyboard.types);
		System.out.println("gauranty: "+keyboard.gauranty);
		
		keyboard.company="HP";
		keyboard.types="Wireless";
		int time=keyboard.gauranty;
		
		System.out.println("Brand: "+keyboard.company);
		System.out.println("Types: "+keyboard.types);
		System.out.println("gauranty: "+keyboard.gauranty);
		System.out.println("================");
		
		Mountain mountain=new Mountain();
		String mountainName=mountain.mountainName;
		String location=mountain.location;
		int feat=mountain.feat;
		
		System.out.println("Mountain Name:"+ mountain.mountainName);
		System.out.println("Location:"+mountain.location);
		System.out.println("Height:"+mountain.feat);
		
		String mount=mountain.mountainName;
		mountain.location="Nepal and Tibet";
		mountain.feat=29029;
		
		System.out.println("Mountain Name:"+ mountain.mountainName);
		System.out.println("Location:"+mountain.location);
		System.out.println("Height:"+mountain.feat);
		System.out.println("================");
		
		Stadium stadium= new Stadium();
		
		String stadiumName=stadium.stadiumName;
		String loc=stadium.loc;
		int meter=stadium.meter;
		
		System.out.println("Stadium Name :"+stadium.stadiumName);
		System.out.println("Location: "+stadium.loc);
		System.out.println("Meters :"+stadium.meter);
		
		String stad=stadium.stadiumName;
		stadium.loc="Chennai";
		stadium.meter=1000;
		
		System.out.println("Stadium Name :"+stadium.stadiumName);
		System.out.println("Location: "+stadium.loc);
		System.out.println("Meters :"+stadium.meter);
		System.out.println("================");
		
		Spray spray= new Spray();
		String sprayBrand=spray.sprayBrand;
		String varity=spray.varity;
		int ml=spray.ml;
		
		System.out.println("Brand: "+spray.sprayBrand);
		System.out.println("Type: "+spray.varity);
		System.out.println("Quantity: "+spray.ml);
		
		spray.sprayBrand="yardely body spray";
		String type1=spray.varity;
		spray.ml=250;
		
		System.out.println("Brand: "+spray.sprayBrand);
		System.out.println("Type: "+spray.varity);
		System.out.println("Quantity: "+spray.ml);
		System.out.println("================");
		
	}
	
}