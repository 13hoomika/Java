class WalletRunner{
	public static void main(String purse[]){
		Wallet wildHorn = new Wallet(10339,"WildHorn",8,"Olive");
		wildHorn.display();
		
		Wallet urban = new Wallet(20063,"URBAN FOREST",2,"Blue Hunter");
		urban.display();
				
		Wallet veltman= new Wallet(30789,"Veltman",3,"20W");
		veltman.display();
				
		Wallet napaHide= new Wallet(40777,"NAPA HIDE",3,"Tan Crunch");
		napaHide.display();
		
		Wallet londonAlley= new Wallet(50678,"LONDON ALLEY",5,"VINTAGE RED");
		londonAlley.display();
		
		Wallet generic = new Wallet(60894,"Generic",5,"Brown");
		generic.display();
				
		Wallet alFascino = new Wallet(70987,"AL FASCINO",4,"Navy Blue");
		alFascino.display();
		
		Wallet tommyHilfiger = new Wallet(80983,"Tommy Hilfiger",7,"Tan");
		tommyHilfiger.display();
		
		Wallet hammondsFlycatcher = new Wallet(90983,"HAMMONDS FLYCATCHER",7,"Brushwood");
		hammondsFlycatcher.display();
		
			
	}
}