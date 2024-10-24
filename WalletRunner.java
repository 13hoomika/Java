class WalletRunner{
	public static void main(String purse[]){
		Wallet wildHorn = new Wallet();
		wildHorn.id = 10339;
		wildHorn.brand = "WildHorn";
		wildHorn.noOfCompartments = 8;
		wildHorn.color = "Olive";
		wildHorn.display();
		
		Wallet urban = new Wallet();
		urban.id = 20063;
		urban.brand = "URBAN FOREST";
		urban.noOfCompartments = 2;
		urban.color = "Blue Hunter";
		urban.display();
				
		Wallet veltman= new Wallet();
		veltman.id = 30789;
		veltman.brand = "Veltman";
		veltman.noOfCompartments = 3;
		veltman.color = "20W";
		veltman.display();
				
		Wallet napaHide= new Wallet();
		napaHide.id = 40777;
		napaHide.brand = "NAPA HIDE";
		napaHide.noOfCompartments = 3;
		napaHide.color = "Tan Crunch";
		napaHide.display();
		
		Wallet londonAlley= new Wallet();
		londonAlley.id = 50678;
		londonAlley.brand = "LONDON ALLEY";
		londonAlley.noOfCompartments = 5;
		londonAlley.color = "VINTAGE RED";
		londonAlley.display();
		
		Wallet generic = new Wallet();
		generic.id = 60894;
		generic.brand = "Generic";
		generic.noOfCompartments = 5 ;
		generic.color = "Brown";
		generic.display();
				
		Wallet alFascino = new Wallet();
		alFascino.id = 70987;
		alFascino.brand = "AL FASCINO";
		alFascino.noOfCompartments = 4 ;
		alFascino.color = "Navy Blue";
		alFascino.display();
		
		Wallet tommyHilfiger = new Wallet();
		tommyHilfiger.id = 80983;
		tommyHilfiger.brand = "Tommy Hilfiger";
		tommyHilfiger.noOfCompartments = 7 ;
		tommyHilfiger.color = "Tan";
		tommyHilfiger.display();
		
		Wallet hammondsFlycatcher = new Wallet();
		hammondsFlycatcher.id = 90983;
		hammondsFlycatcher.brand = "HAMMONDS FLYCATCHER";
		hammondsFlycatcher.noOfCompartments = 7 ;
		hammondsFlycatcher.color = "Brushwood";
		hammondsFlycatcher.display();
		
			
	}
}