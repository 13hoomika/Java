class IceCream{
	int id; 
	String brand; 
	String flavors; 
	String type; 
	String quantity;
	
	public IceCream()
	{
		System.out.println("IceCream constructor invoking!!!");
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