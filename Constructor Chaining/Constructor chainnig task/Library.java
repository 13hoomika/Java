class Library{
	int libraryId;
	String address;
	String type;
	String libraryOwnerName;

	
	public Library(){
		this(111,"Jayanagar,4th block,Bengaluru");
		System.out.println("default constructor");
	}
	public Library(int libraryId,String address){
		this("Public","Ravi Kumar");
		this.libraryId = libraryId;
		this.address = address;
		System.out.println("int and String parameterized Constructor");
	}
	
	
	public Library(String type,String libraryOwnerName)
	{
		this.type = type;
		this.libraryOwnerName = libraryOwnerName;
		
	}
	
	public void getLibraryInfo(){
		System.out.println("Library libraryId: "+libraryId);
		System.out.println("Library type: "+type);
		System.out.println("Library address: "+address);
		System.out.println("Library libraryOwnerName: "+libraryOwnerName);
		System.out.println("--------------------------------------------------");
	}
}