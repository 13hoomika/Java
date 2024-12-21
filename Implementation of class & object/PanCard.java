class PanCard{

String panNumber;
String name;
String fatherName;
String dob;

	public PanCard()
	{
		System.out.println("PanCard class invoked constructor");
	}
	
	public void PanCardDetails(){
		System.out.println("PanCard number: "+panNumber);
		System.out.println("PanCard name: "+name);
		System.out.println("PanCard fatherName: "+fatherName);
		System.out.println("PanCard dob: "+dob);
		System.out.println("----------------------------------------");
	}

}