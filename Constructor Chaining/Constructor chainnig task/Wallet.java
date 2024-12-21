class Wallet{
	int id;
	String brand;
	int noOfCompartments;
	String color;
	
	public Wallet(){
		this("WildHorn","Olive");
	}	
		
	public Wallet(String brand,String color){
		this(10339,8);
		this.brand = brand;
		this.color = color;
	}
	public Wallet(int id,int noOfCompartments){
		this.id = id;
		this.noOfCompartments = noOfCompartments;
		this.color = color;
	}
	
	public void display(){
		System.out.println("Wallet id: " + id);
		System.out.println("Wallet brand: " + brand);
		System.out.println("Wallet no of compartments: " + noOfCompartments);
		System.out.println("Wallet color: " + color);
		System.out.println("------------------------------------------------------");
	}
	
}