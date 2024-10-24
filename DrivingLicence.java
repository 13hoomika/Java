class DrivingLicence{
	String dlNo;
	String name;
	String dob;
	String validTill;
	String bloodGroup;
	String fatherName;
	String rtoOfficeNumber;
	
	DrivingLicence(){
		System.out.println("Started DrivingLicence Constructer");
	}
	
	public void allObj(){
		System.out.println("DL number" + dlNo);
		System.out.println("DL holder name" + name);
		System.out.println("DL valid till" + validTill);
		System.out.println("DL holder blood group" + bloodGroup);
		System.out.println("DL holder father name" + fatherName);
		System.out.println("DL rto office number" + rtoOfficeNumber);
		System.out.println("-----------------------------------");
	}
}