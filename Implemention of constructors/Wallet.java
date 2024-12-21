class Wallet{
	int id;
	String brand;
	int noOfCompartments;
	String color;
		
	Wallet(int i,String b,int n,String c){
		id = i;
		brand = b;
		noOfCompartments = n;
		color = c;
	}
	
	public void display(){
		System.out.println("Wallet id: " + id);
		System.out.println("Wallet brand: " + brand);
		System.out.println("Wallet no of compartments: " + noOfCompartments);
		System.out.println("Wallet color: " + color);
		System.out.println("------------------------------------------------------");
	}
	
}