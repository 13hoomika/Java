class Wallet{
	int id;
	String brand;
	int noOfCompartments;
	String color;
	
	Wallet(){
		System.out.println("Im in Wallet Constructor");
	}
	
	public void display(){
		System.out.println("Wallet id: " + id);
		System.out.println("Wallet brand: " + brand);
		System.out.println("Wallet no of compartments: " + noOfCompartments);
		System.out.println("Wallet color: " + color);
		System.out.println("------------------------------------------------------");
	}
	
}