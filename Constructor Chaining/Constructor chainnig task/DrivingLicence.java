class DrivingLicence{
	String dlNo;
	String name;
	String dob;
	String validTill;
	String bloodGroup;
	String fatherName;
	int rtoOfficeNumber;
	
	public DrivingLicence()
	{
		this("KA46 2020003345","Navya","10/03/2001");
		System.out.println("Driving Licence Constructor is invoked");
	}
	
	public DrivingLicence(String dlNo,String name,String dob)
	{
		this("04/10/2040","A+","Shekhar",46);
		System.out.println("2nd arg i.e(int, String) constructor is invoked");
		this.dlNo = dlNo;
		this.name = name;
		this.dob = dob;
	}
	
	public DrivingLicence(String validTill,String bloodGroup,String fatherName,int rtoOfficeNumber)
	{
		System.out.println("2nd arg i.e(int, String) constructor is invoked");
		this.validTill = validTill;
		this.bloodGroup = bloodGroup;
		this.fatherName = fatherName;
		this.rtoOfficeNumber = rtoOfficeNumber;
	}
	
	public void fetchallObj(){
		System.out.println("DL number: " + dlNo);
		System.out.println("DL holder name: " + name);
		System.out.println("DL valid till: " + validTill);
		System.out.println("DL holder blood group: " + bloodGroup);
		System.out.println("DL holder father name: " + fatherName);
		System.out.println("DL rto office number: " + rtoOfficeNumber);
		System.out.println("-----------------------------------");
	}
}