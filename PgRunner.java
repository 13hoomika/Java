class PgRunner{
	public static void main(String a[]){
		Pg apartment1 = new Pg();
		apartment1.pgOwner="Venugopal Reddy";
		apartment1.rent=5000;
		apartment1.noOfFloors=4;
		apartment1.pgAddress="Rajajinagar,Bengaluru";
		apartment1.PgDetails();
		
		Pg apartment2 = new Pg();
        apartment2.pgOwner = "Srinivas Gowda";
        apartment2.rent = 6000;
        apartment2.noOfFloors = 3;
        apartment2.pgAddress = "Jayanagar, Bengaluru";
        apartment2.PgDetails();

        Pg apartment3 = new Pg();
        apartment3.pgOwner = "Anita Rao";
        apartment3.rent = 5500;
        apartment3.noOfFloors = 5;
        apartment3.PgDetails();

        Pg apartment4 = new Pg();
        apartment4.pgOwner = "Harish Patil";
        apartment4.rent = 4500;
        apartment4.noOfFloors = 2;
        apartment4.pgAddress = "Hebbal, Bengaluru";
        apartment4.PgDetails();

        Pg apartment5 = new Pg();
        apartment5.pgOwner = "Lakshmi Desai";
        apartment5.rent = 4000;
        apartment5.noOfFloors = 3;
        apartment5.pgAddress = "Gokul, Hubli";
        apartment5.PgDetails();

        Pg apartment6 = new Pg();
        apartment6.pgOwner = "Rajesh Shetty";
        apartment6.rent = 7000;
        apartment6.noOfFloors = 4;
        apartment6.pgAddress = "Ballalbagh, Mangalore";
        apartment6.PgDetails();
		
        Pg apartment7 = new Pg();
        apartment7.pgOwner = "Praveen Kumar";
        apartment7.rent = 5000;
        apartment7.noOfFloors = 3;
        apartment7.pgAddress = "Vijayanagar, Bengaluru";
        apartment7.PgDetails();

        Pg apartment8 = new Pg();
        apartment8.pgOwner = "Ganesh Acharya";
        apartment8.rent = 6500;
        apartment8.noOfFloors = 5;
        apartment8.pgAddress = "Chamarajpet, Bengaluru";
        apartment8.PgDetails();

        Pg apartment9 = new Pg();
        apartment9.pgOwner = "Kiran Hegde";
        apartment9.rent = 4800;
        apartment9.noOfFloors = 4;
        apartment9.pgAddress = "Basavanagudi, Bengaluru";
        apartment9.PgDetails();
	}
}