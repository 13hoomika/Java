class TrainingBatch{
	
	String batchName;
	int noOfTrinees;
	String trainerName;
	String instituteName;
	
	public TrainingBatch(){
		this("Java Advanced Concepts",8,"Mr.Shanthanu","X-workz");
	}

	public TrainingBatch(String batchName,int noOfTrinees,String trainerName,String instituteName){
		this.batchName = batchName;
		this.noOfTrinees = noOfTrinees;
		this.trainerName = trainerName;
		this.instituteName = instituteName;
	}
	
	public void TrainingBatchDetails(){
		System.out.println("TrainingBatch batchName: "+batchName);
		System.out.println("TrainingBatch noOfTrinees: "+noOfTrinees);
		System.out.println("TrainingBatch TrainerName: "+trainerName);
		System.out.println("TrainingBatch instituteName: "+instituteName);
		System.out.println("-----------------------------------------------");
	}

}