class Pg{
	 String pgOwner;
	 int rent;
	 int noOfFloors;
	 String pgAddress;
	 
	 public Pg()
	{
		System.out.println("Pg class invoked constructor");
	}
	
	public void PgDetails(){
		System.out.println("Pg Owner: "+pgOwner);
		System.out.println("Pg rent: "+rent);
		System.out.println("Pg noOfFloors: "+noOfFloors);
		System.out.println("Pg pgAddress: "+pgAddress);
		System.out.println("----------------------------------------");
	}
}