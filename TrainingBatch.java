class TrainingBatch{
	
String batchName;
int noOfTrinees;
String trainerName;
String instituteName;

	public TrainingBatch(String bname,int no,String tName,String name){
		batchName = bname;
		noOfTrinees = no;
		trainerName = tName;
		instituteName = name;
	}
	
	public void TrainingBatchDetails(){
		System.out.println("TrainingBatch batchName: "+batchName);
		System.out.println("TrainingBatch noOfTrinees: "+noOfTrinees);
		System.out.println("TrainingBatch TrainerName: "+trainerName);
		System.out.println("TrainingBatch instituteName: "+instituteName);
		System.out.println("-----------------------------------------------");
	}

}