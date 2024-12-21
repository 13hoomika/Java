class TrainTicket{

long pnr;
int age;
String gender;
String name;

public TrainTicket(long ticketpnr,int a,String g,String n)
	{
		pnr = ticketpnr;
		age = a;
		gender = g;
		name = n;
	}
	
	public void TrainTicketDetails(){
		System.out.println("TrainTicket PNR: "+pnr);
		System.out.println("TrainTicket Age: "+age);
		System.out.println("TrainTicket Gender: "+ gender);
		System.out.println("TrainTicket Name: "+ name);
		System.out.println("----------------------------------------");
	}


}