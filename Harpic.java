class Harpic{
	int id; 
	int quantity; 
	float price ; 
	String color;
	
	public Harpic()
	{
		System.out.println("Harpic constructor invoked here!!");
	}
	
	public void getHarpicInfo(){
		System.out.println("Harpic ID: "+id);
		System.out.println("Harpic type: "+quantity);
		System.out.println("Harpic ID: "+price);
		System.out.println("Harpic type: "+color);
		System.out.println("--------------------------");
	}
}