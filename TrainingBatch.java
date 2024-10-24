class TrainingBatch{
	
String batchName;
int noOfTrinees;
String TrainerName;
String instituteName;

public TrainingBatch()
	{
		System.out.println("TrainingBatch class invoked constructor");
	}
	
	public void TrainingBatchDetails(){
		System.out.println("TrainingBatch batchName: "+batchName);
		System.out.println("TrainingBatch noOfTrinees: "+noOfTrinees);
		System.out.println("TrainingBatch TrainerName: "+TrainerName);
		System.out.println("TrainingBatch instituteName: "+instituteName);
		System.out.println("-----------------------------------------------");
	}

}