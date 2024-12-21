class DrivingLicence{
	String dlNo;
	String name;
	String dob;
	String validTill;
	String bloodGroup;
	String fatherName;
	String rtoOfficeNumber;
	
	DrivingLicence(String no,String nam,String birthday, String validity, String group,String fname, String rto){
		dlNo = no;
		name = nam;
		dob = birthday;
		validTill = validity;
		bloodGroup = group;
		fatherName = fname;
		rtoOfficeNumber = rto;
		
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