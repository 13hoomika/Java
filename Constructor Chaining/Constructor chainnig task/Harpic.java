class Harpic{
	int id; 
	int quantity; 
	float price ; 
	String color;
	//10300,3,192.0f,"blue"
	public Harpic()
	{
		this(10300,3);
		System.out.println("Harpic constructor invoked here!!");
	}
	public Harpic(int id,int quantity)
	{
		this(192.0f,"blue");
		this.id = id;
		this.quantity = quantity;
		System.out.println("parametarized constructor invoked here!!");
	}
	public Harpic(float price,String color)
	{
		this.price = price;
		this.color = color;
		System.out.println("parametarized constructor invoked here!!");
	}
	
	public void getHarpicInfo(){
		System.out.println("Harpic ID: "+id);
		System.out.println("Harpic type: "+quantity);
		System.out.println("Harpic ID: "+price);
		System.out.println("Harpic type: "+color);
		System.out.println("--------------------------");
	}
}