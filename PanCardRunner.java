class PanCardRunner{
	public static void main(String card[]){
		
		PanCard pan1= new PanCard("ABCDE1234F","Rohan Verma","Rajesh Verma","12-05-1990");
		pan1.PanCardDetails();	

		PanCard pan2= new PanCard("FGHIJ5678K","Neha Sharm","Suresh Sharma","23-08-1993");
		pan2.PanCardDetails();

		PanCard pan3= new PanCard("KLMNO9101P","Sandeep Kumar"," Prakash Kumar","15-11-1985");
		pan3.PanCardDetails();

		PanCard pan4= new PanCard("PQRST2345V","Priya Desai","Vijay Desai","04-02-1992");
		pan4.PanCardDetails();

		PanCard pan5= new PanCard("UVWXY6789Z"," Anil Pate","Ramesh Patel","09-07-1988");
		pan5.PanCardDetails();

		PanCard pan6= new PanCard();
		pan6.panNumber="ZXCVB0123A";
		pan6.name=" Kavita Rao";
		pan6.fatherName=" Mohan Rao";
		pan6.dob="18-03-1995";
		pan6.PanCardDetails();

		PanCard pan7= new PanCard();
		pan7.panNumber="QWERT4567B";
		pan7.name=" Vishal Singh";
		pan7.fatherName="Devendra Singh";
		pan7.dob="27-12-1980";
		pan7.PanCardDetails();

		PanCard pan8= new PanCard();
		pan8.panNumber="ASDFG8910C";
		pan8.name="Meena Gupta";
		pan8.fatherName=" Gopal Gupta";
		pan8.dob="14-10-1994";
		pan8.PanCardDetails();

		PanCard pan9= new PanCard();
		pan9.panNumber="HJKLP3456D";
		pan9.name=" Amit Joshi";
		pan9.fatherName=" Mukesh Joshi";
		pan9.dob="01-06-1987";
		pan9.PanCardDetails();

	}

}