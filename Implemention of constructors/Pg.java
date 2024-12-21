class Pg{
	 String pgOwner;
	 int rent;
	 int noOfFloors;
	 String pgAddress;
	 
	 public Pg(String pgO,int r,int nf,String pgloc)
	{
		pgOwner = pgO;
		rent = r;
		noOfFloors = nf;
		pgAddress = pgloc;
	}
	
	public void PgDetails(){
		System.out.println("Pg Owner: "+pgOwner);
		System.out.println("Pg rent: "+rent);
		System.out.println("Pg noOfFloors: "+noOfFloors);
		System.out.println("Pg pgAddress: "+pgAddress);
		System.out.println("----------------------------------------");
	}
}