class TubeLight{
	int id; 
	String brand;
	String price; 
	String voltage;
	
	public TubeLight()
	{
		System.out.println("TubeLight class invoking this constructor!!");
	}
	
	public void TubeLightDetails(){
		System.out.println("TubeLight id: "+id);
		System.out.println("TubeLight brand: "+brand);
		System.out.println("TubeLight price: "+price);
		System.out.println("TubeLight voltage: "+voltage);
		System.out.println("----------------------------------------");
	}
}