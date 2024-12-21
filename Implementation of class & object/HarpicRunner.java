class HarpicRunner{
	public static void main(String toilCleaner[]){
		
		Harpic sniFresh = new Harpic();
		sniFresh.id = 10300;
		sniFresh.quantity = 3;
		sniFresh.price = 192;
		sniFresh.color = "blue";
		sniFresh.getHarpicInfo();
		
		Harpic domex = new Harpic();
		domex.id = 20088;
		domex.getHarpicInfo();
		
		Harpic amazon= new Harpic();
		amazon.id = 30789;
		amazon.quantity = 2;
		amazon.price = amazon.quantity * 201;
		amazon.color = "Dark blue";
		
		amazon.getHarpicInfo();
		
		Harpic oxygen= new Harpic();
		oxygen.id = 40777;
		oxygen.quantity = 2;
		oxygen.price = oxygen.quantity * 179;
		oxygen.color = "white";
		
		oxygen.getHarpicInfo();
		
		Harpic kleenest= new Harpic();
		kleenest.id = 50678;
		kleenest.quantity = 2;
		kleenest.price = 351 * kleenest.quantity;
		kleenest.color = "rose pink & white";
		
		kleenest.getHarpicInfo();
		
		Harpic activeWhite = new Harpic();
		activeWhite.id = 60894;
		activeWhite.quantity = 3;
		activeWhite.price = 219;
		activeWhite.color = "shimmer white";
		
		activeWhite.getHarpicInfo();
		
		Harpic harpicOriginal = new Harpic();
		harpicOriginal.id = 70987;
		harpicOriginal.quantity = 3;
		harpicOriginal.price = harpicOriginal.quantity * 380 ;
		harpicOriginal.color = "Navy Blue";
		
		harpicOriginal.getHarpicInfo();
		
		Harpic harpicShine = new Harpic();
		harpicShine.id = 80897;
		harpicShine.quantity = 5;
		harpicShine.price = harpicShine.quantity * 105 ;
		harpicShine.color = "White";
		harpicShine.getHarpicInfo();
		
		Harpic domexFresh = new Harpic();
		domexFresh.id = 90997;
		domexFresh.quantity = 4;
		domexFresh.price = domexFresh.quantity * 175 ;
		domexFresh.color = "Brushwood";
		
		domexFresh.getHarpicInfo();
			
	}
}