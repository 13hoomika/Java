class PgRunner{
	public static void main(String a[]){
		Pg apartment1 = new Pg("Venugopal Reddy",5000,4,"Rajajinagar,Bengaluru");
		apartment1.PgDetails();
		
		Pg apartment2 = new Pg("Srinivas Gowda",6000,3,"Jayanagar, Bengaluru");
        apartment2.PgDetails();

        Pg apartment3 = new Pg("Anita Rao",5500,5,"ragjajinagar");
        apartment3.PgDetails();

        Pg apartment4 = new Pg("Harish Patil",4500,2,"Hebbal, Bengaluru");
        
        apartment4.PgDetails();

        Pg apartment5 = new Pg("Lakshmi Desai",4000,3,"Gokul, Hubli");
        apartment5.PgDetails();

        Pg apartment6 = new Pg("Rajesh Shetty",7000,4,"Ballalbagh, Mangalore");
        apartment6.PgDetails();
		
        Pg apartment7 = new Pg("Praveen Kumar",5000,3,"Vijayanagar, Bengaluru");
        apartment7.PgDetails();

        Pg apartment8 = new Pg("Ganesh Acharya",6500,5,"Chamarajpet, Bengaluru");
        apartment8.PgDetails();

        Pg apartment9 = new Pg("Kiran Hegde",4800,4,"Basavanagudi, Bengaluru");
        apartment9.PgDetails();
	}
}