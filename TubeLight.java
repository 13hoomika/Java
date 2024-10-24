class TubeLight{
	int id; 
	String brand;
	String price; 
	String voltage;
	
		
	public TubeLight(int i,String b, String p, String v)
	{
		id = i;
		brand = b;
		price = p;
		voltage = v;
	}
	
	public void TubeLightDetails(){
		System.out.println("TubeLight id: "+id);
		System.out.println("TubeLight brand: "+brand);
		System.out.println("TubeLight price: "+price);
		System.out.println("TubeLight voltage: "+voltage);
		System.out.println("----------------------------------------");
	}
}