class PanCard{

	String panNumber;
	String name;
	String fatherName;
	String dob;

	public PanCard(String pno,String nam,String fname,String birthday)
	{
		panNumber = pno;
		name = nam;
		fatherName= fname;
		dob = birthday;
	}
	
	public void PanCardDetails(){
		System.out.println("PanCard number: "+panNumber);
		System.out.println("PanCard name: "+name);
		System.out.println("PanCard fatherName: "+fatherName);
		System.out.println("PanCard dob: "+dob);
		System.out.println("----------------------------------------");
	}

}