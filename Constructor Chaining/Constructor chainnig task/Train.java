class Train{

	long trainNo;
	int noOfCoaches;
	String trainName;
	
	public Train(){
		this(12685,21,"KSR Bengaluru - Mangaluru Central SF Express");
	}

	public Train(long trainNo,int noOfCoaches, String trainName){
		this.trainNo = trainNo;
		this.noOfCoaches = noOfCoaches;
		this.trainName = trainName;
	}
	
	public void TrainDetails(){
		System.out.println("Train trainNo: "+trainNo);
		System.out.println("Train noOfCoaches: "+noOfCoaches);
		System.out.println("Train trainName: "+trainName);
		System.out.println("----------------------------------------");
	}


}