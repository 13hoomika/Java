class IceCreamRunner{
	public static void main(String container[]){
		IceCream iceCream = new IceCream();
		iceCream.id = 1001;
		iceCream.brand = "Amul";
		iceCream.flavors = "Vanilla";
		iceCream.type = "Tub";
		iceCream.quantity = "100g";
		iceCream.getHarpicDetails();
		
		IceCream KwalityWalls = new IceCream();
		KwalityWalls.id = 1002;
		KwalityWalls.brand = "Kwality Walls";
		KwalityWalls.flavors = "Cookies & Cream";
		KwalityWalls.type = "Box";
		KwalityWalls.quantity = "500g";
		
		KwalityWalls.getHarpicDetails();
		
		IceCream cadbury = new IceCream();
		cadbury.id = 1003;
		cadbury.brand = "cadbury";
		cadbury.flavors = "Chocolate";
		cadbury.type = "Box";
		cadbury.quantity = "300ml";
		cadbury.getHarpicDetails();
		
		IceCream papilon = new IceCream();
		papilon.id = 1004;
		papilon.brand = "Papilon";
		papilon.flavors = "Mint Chocolate Chip.";
		papilon.type = "Jar";
		papilon.quantity = "500g";
		
		papilon.getHarpicDetails();
		
		IceCream weikfield = new IceCream();
		weikfield.id = 1005;
		weikfield.brand = "Weikfield";
		weikfield.flavors = "Pistachio";
		weikfield.type = "Box";
		weikfield.quantity = "500g";
		weikfield.getHarpicDetails();
		
		IceCream kwality = new IceCream();
		kwality.id = 1006;
		kwality.brand = "Kwality";
		kwality.flavors = "Strawberry";
		kwality.type = "Pouch";
		kwality.quantity = "500g";
		kwality.getHarpicDetails();
		
		IceCream Oreo = new IceCream();
		Oreo.id = 1007;
		Oreo.brand = "Oreo";
		Oreo.flavors = "Mango";
		Oreo.type = "Box";
		Oreo.quantity = "250g";
		
		Oreo.getHarpicDetails();
		
		IceCream SunfeastDarkFantasy = new IceCream();
		SunfeastDarkFantasy.id = 1008;
		SunfeastDarkFantasy.brand = "Sunfeast Dark Fantasy";
		SunfeastDarkFantasy.flavors = "coconut";
		SunfeastDarkFantasy.type = "Jar";
		SunfeastDarkFantasy.quantity = "600 ml";
		
		SunfeastDarkFantasy.getHarpicDetails();
		
		IceCream hersheys = new IceCream();
		hersheys.id = 1009;
		hersheys.brand = "Hershey's";
		hersheys.flavors = "Butterscotch";
		hersheys.type = "Tub";
		hersheys.quantity = "310 ml";
		
		hersheys.getHarpicDetails();
		
		
	}
}