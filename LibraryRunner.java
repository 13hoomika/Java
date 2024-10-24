class LibraryRunner{
	//libraryId , address , type , libraryOwnerName
	public static void main(String books[]){
		Library building1 = new Library();
		building1.libraryId=111;
		building1.address="Jayanagar,4th block,Bengaluru";
		building1.type="Public";
		building1.libraryOwnerName="Ravi Kumar";
		building1.getLibraryInfo();
		
		Library building2 = new Library();
        building2.libraryId = 112;
        building2.address = "MG Road, Bengaluru";
        building2.type = "Private";
        building2.libraryOwnerName = "Suresh Bhat";
        building1.getLibraryInfo();

        Library building3 = new Library();
        building3.libraryId = 113;
        building3.address = "Kuvempunagar, Mysuru";
        building3.type = "Public";
        building3.libraryOwnerName = "Mohan Gowda";
       building3.getLibraryInfo();

        Library building4 = new Library();
        building4.libraryId = 114;
        building4.address = "Vijayanagar, Bengaluru";
        building4.type = "Private";
        building4.libraryOwnerName = "Shiva Reddy";
        building4.getLibraryInfo();

        Library building5 = new Library();
        building5.libraryId = 115;
        building5.address = "Hubli-Dharwad, Hubli";
        building5.type = "Public";
        building5.libraryOwnerName = "Lakshmi Desai";
        building5.getLibraryInfo();

        Library building6 = new Library();
        building6.libraryId = 116;
        building6.address = "Indiranagar, Bengaluru";
        building6.type = "Private";
        building6.libraryOwnerName = "Anita Rao";
        building6.getLibraryInfo();

        Library building7 = new Library();
        building7.libraryId = 117;
        building7.address = "Chikmagalur, Karnataka";
        building7.type = "Public";
        building7.libraryOwnerName = "Rajesh Shetty";
        building7.getLibraryInfo();

        Library building8 = new Library();
        building8.libraryId = 118;
        building8.address = "Udupi, Karnataka";
        building8.type = "Private";
        building8.libraryOwnerName = "Ganesh Acharya";
        building8.getLibraryInfo();

        Library building9 = new Library();
        building9.libraryId = 119;
        building9.address = "Rajajinagar, Bengaluru";
        building9.type = "Public";
        building9.libraryOwnerName = "Vikram Patil";
        building9.getLibraryInfo();
	}
}