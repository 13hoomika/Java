class LibraryRunner{
	//libraryId , address , type , libraryOwnerName
	public static void main(String books[]){
		Library building1 = new Library(111,"Jayanagar,4th block,Bengaluru","Public","Ravi Kumar");
		building1.getLibraryInfo();
		
		Library building2 = new Library(112,"MG Road, Bengaluru","Private","Suresh Bhat");
        building1.getLibraryInfo();

        Library building3 = new Library(113,"Kuvempunagar, Mysuru","Public","Manoj");
       building3.getLibraryInfo();

        Library building4 = new Library(114,"Vijayanagar, Bengaluru","Private","Shiva Reddy");
        building4.getLibraryInfo();

        Library building5 = new Library(115,"Hubli","Public","Lakshmi Desai");
        building5.getLibraryInfo();

        Library building6 = new Library(116, "Indiranagar, Bengaluru","Private","Anita Rao");
        building6.getLibraryInfo();

        Library building7 = new Library(117,"Chikmagalur,Karnataka","Public","Rajesh Shetty");
        building7.getLibraryInfo();

        Library building8 = new Library(118,"Udupi, Karnataka","Public","Ganesh Acharya");
        building8.getLibraryInfo();

        Library building9 = new Library(119,"Rajajinagar, Bengaluru","Public","Vikram Patil");
        building9.getLibraryInfo();
	}
}