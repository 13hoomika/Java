class shoppingMallRunner{
	public static void main(String[] luluMall){
		boolean isListCreated = shoppingMall.CreateShops("Mia by Tanishq");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("Giva");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("Peora");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("HaagenDazs");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		
		isListCreated = shoppingMall.CreateShops("The Coffee Cup");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("Funtura");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("Cinepolis");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("Zouk");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("Metro Shoes");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		isListCreated = shoppingMall.CreateShops("Crocs");
		System.out.println("Shop name added to list - "+ isListCreated);
		
		shoppingMall.getShops();
		
		boolean update = shoppingMall.updatShop("Crocs","Zara");
		System.out.println("Name Updated "+ update);
		
		shoppingMall.getShops();
		
		boolean delete = shoppingMall.deleteByName("Metro Shoes");
		System.out.println("Deleted "+ delete);
		
		shoppingMall.getNewArr();
	}
}