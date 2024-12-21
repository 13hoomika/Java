class PhonePeRunner{
	public static void main(String payments[]){
		System.out.println("Main started");
		
		boolean isInsurenceAdded = PhonePe.createInsurence("LIC Life Insurence");
		System.out.println("Insurence Added: " + isInsurenceAdded);
		
		isInsurenceAdded = PhonePe.createInsurence("HDFC Life Insurence");
		System.out.println("Insurence Added: " + isInsurenceAdded);
		
		isInsurenceAdded = PhonePe.createInsurence("Reliance Nippon Life Insurence");
		System.out.println("Insurence Added: " + isInsurenceAdded);
		
		isInsurenceAdded = PhonePe.createInsurence("TATA AIA Life Insurence");
		System.out.println("Insurence Added: " + isInsurenceAdded);
		
		isInsurenceAdded = PhonePe.createInsurence("Kotak  Allianz Life Insurence");
		System.out.println("Insurence Added: " + isInsurenceAdded);
		
		PhonePe.getInsurence();
		
		boolean update = PhonePe.updatedInsurence("TATA AIA Life Insurence","Bajaj Allianz");
		System.out.println("Updated Insurence name "+ update);
		
		PhonePe.getInsurence();
		
		boolean deletedFile = PhonePe.deleteInsurenceByName("HDFC Life Insurence");
		
		PhonePe.getNewInsurences();
		
		System.out.println("Main Ended");
	}
}