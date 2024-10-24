class TrainTicket{

long PNR;
int Age;
String Gender;
String Name;

public TrainTicket()
	{
		System.out.println("TrainTicket class invoking TrainTicket constructor");
	}
	
	public void TrainTicketDetails(){
		System.out.println("TrainTicket PNR: "+PNR);
		System.out.println("TrainTicket Age: "+Age);
		System.out.println("TrainTicket Gender: "+Gender);
		System.out.println("TrainTicket Name: "+Name);
		System.out.println("----------------------------------------");
	}


}