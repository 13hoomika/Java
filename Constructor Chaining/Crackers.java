class Crackers{
	int crackerId;
	String crackerName;
	double price;
	String crackerType;
	
	// public Crackers(int crackerId,String crackerName,double price,String crackerType){
		// this.crackerId = crackerId;
		// this.crackerName = crackerName;
		// this.price = price;
		// this.crackerType = crackerType;
	// }
	
	public Crackers(){
		this(1,"Flowerpot");//  Crackers(int crackerId,String crackerName)
		System.out.println("no arg constructoris invoked");
	}
	public Crackers(int crackerId,String crackerName){
		this(1000.00,"sparkling");
		System.out.println("2 arg i.e (int,String) constructoris invoked");
		this.crackerId = crackerId;
		this.crackerName = crackerName;
	}
	public Crackers(double price,String crackerType){
		// this(1000.00,"sparkling");
		System.out.println("2 arg i.e (double,String) constructoris invoked");
		this.price = price;
		this.crackerType = crackerType;
	}
	
	public void getCrackersInfo(){
		System.out.println("The Cracker id is: " + crackerId);
		System.out.println("The Cracker name is: " + crackerName);
		System.out.println("The Cracker price is: " + price);
		System.out.println("The Cracker type is: " + crackerType);
		
	}
}