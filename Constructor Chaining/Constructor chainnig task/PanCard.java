class PanCard{

	String panNumber;
	String name;
	String fatherName;
	String dob;
	
	public PanCard(){
		this("FGHH08765PK","Arun Anandh","Anandh","18-12-1998");
	}
	public PanCard(String panNumber,String name,String fatherName,String dob)
	{
		this.panNumber = panNumber;
		this.name = name;
		this.fatherName= fatherName;
		this.dob = dob;
	}
	
	public void PanCardDetails(){
		System.out.println("PanCard number: "+panNumber);
		System.out.println("PanCard name: "+name);
		System.out.println("PanCard fatherName: "+fatherName);
		System.out.println("PanCard dob: "+dob);
		System.out.println("----------------------------------------");
	}

}