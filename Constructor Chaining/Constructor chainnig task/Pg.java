class Pg{
	 String pgOwner;
	 int rent;
	 int noOfFloors;
	 String pgAddress;
	
	 
	public Pg(){
		this("Gopala Krishna",6000,2,"Rajajinagar,Bengaluru");
	}
	public Pg(String pgOwner,int rent,int noOfFloors,String pgAddress){
		this.pgOwner = pgOwner;
		this.rent = rent;
		this.noOfFloors = noOfFloors;
		this.pgAddress = pgAddress;
	}
	
	public void PgDetails(){
		System.out.println("Pg Owner: "+pgOwner);
		System.out.println("Pg rent: "+rent);
		System.out.println("Pg noOfFloors: "+noOfFloors);
		System.out.println("Pg pgAddress: "+pgAddress);
		System.out.println("----------------------------------------");
	}
}