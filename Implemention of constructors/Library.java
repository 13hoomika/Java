class Library{
	int libraryId;
	String address;
	String type;
	String libraryOwnerName;
	
	public Library(int id,String loc,String t,String owner)
	{
		libraryId = id;
		address = loc;
		type = t;
		libraryOwnerName = owner;
		
	}
	
	public void getLibraryInfo(){
		System.out.println("Library libraryId: "+libraryId);
		System.out.println("Library type: "+type);
		System.out.println("Library address: "+address);
		System.out.println("Library libraryOwnerName: "+libraryOwnerName);
		System.out.println("--------------------------------------------------");
	}
}