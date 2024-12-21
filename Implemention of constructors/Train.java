class Train{

	long trainNo;
	int noOfCoaches;
	String trainName;

	public Train(long no,int c, String nam){
		trainNo = no;
		noOfCoaches = c;
		trainName = nam;
	}
	
	public void TrainDetails(){
		System.out.println("Train trainNo: "+trainNo);
		System.out.println("Train noOfCoaches: "+noOfCoaches);
		System.out.println("Train trainName: "+trainName);
		System.out.println("----------------------------------------");
	}


}