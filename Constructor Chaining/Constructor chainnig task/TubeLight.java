class TubeLight{
	int id; 
	String brand;
	String price; 
	String voltage;
	
	public TubeLight(){
		this(10840,"Crompton");
	}
		
	public TubeLight(int id,String brand)
	{
		this("139 rs","20W");
		this.id = id;
		this.brand = brand;
	}
	
	public TubeLight(String price, String voltage){
		this.price = price;
		this.voltage = voltage;
	}
	
	public void TubeLightDetails(){
		System.out.println("TubeLight id: "+id);
		System.out.println("TubeLight brand: "+brand);
		System.out.println("TubeLight price: "+price);
		System.out.println("TubeLight voltage: "+voltage);
		System.out.println("----------------------------------------");
	}
}