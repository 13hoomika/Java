class IceCream{
	int id; 
	String brand; 
	String flavors; 
	String type; 
	String quantity;
	
	public IceCream(int i,String b,String f,String t,String q)
	{
		id = i;
		brand= b;
		flavors = f;
		type = t;
		quantity = q;
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