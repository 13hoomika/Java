class IceCream{
	int id; 
	String brand; 
	String flavors; 
	String type; 
	String quantity;
	
	public IceCream(){
		this(1001,"Amul");
		System.out.println("0 args");
	}
	public IceCream(int id,String brand){
		this("Vanilla","Tub","100g");
		this.id = id;
		this.brand= brand;
		System.out.println("0 args");
	}
	
	public IceCream(String flavors,String type,String quantity)
	{
		this.flavors = flavors;
		this.type = type;
		this.quantity = quantity;
	}
	
	public void getHarpicDetails(){
		System.out.println("IceCream ID: "+id);
		System.out.println("IceCream brand: "+brand);
		System.out.println("IceCream type: "+quantity);
		System.out.println("IceCream ID: "+type);
		System.out.println("IceCream type: "+flavors);
		System.out.println("--------------------------------------");
	}
}