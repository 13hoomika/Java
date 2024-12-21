class TrainTicket{

	long pnr;
	int age;
	String gender;
	String name;
	
	public TrainTicket(){
		this(12301,24,"Anitha","Female");
	}
	public TrainTicket(long pnr,int age,String gender,String name)
	{
		this.pnr = pnr;
		this.age = age;
		this.gender = gender;
		this.name = name;
	}
	
	public void TrainTicketDetails(){
		System.out.println("TrainTicket PNR: "+pnr);
		System.out.println("TrainTicket Age: "+age);
		System.out.println("TrainTicket Gender: "+ gender);
		System.out.println("TrainTicket Name: "+ name);
		System.out.println("----------------------------------------");
	}


}