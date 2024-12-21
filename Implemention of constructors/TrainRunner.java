class TrainRunner{
	public static void main(String rail[]){

		Train train1= new Train(12627L,24,"Karnataka Express");
		train1.TrainDetails();

		Train train2= new Train(12951L,22,"Mumbai Rajdhani Express");
		train2.TrainDetails();

		Train train3= new Train(16526,18,"KSR Bengaluru - Kanniyakumari Express");
		train3.TrainDetails();

		Train train4= new Train(16590,17,"Rani Chennamma Express");
		train4.TrainDetails();

		Train train5= new Train(12658,17,"Gol Gumbaz Express");
		train5.TrainDetails();

		Train train6= new Train(12685,21,"KSR Bengaluru - Mangaluru Central SF Express");
		train6.TrainDetails();

		Train train8= new Train(16516,20,"KSR Bengaluru - Yeshvantpur Intercity Express");
		train8.TrainDetails();

		Train train9= new Train(12213,15, "KSR Bengaluru - Patna SF Express");
		train9.TrainDetails();

	}

}