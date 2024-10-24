class Bread {
	String brandName;
	int noOfSlices;
	String type;
	
	Bread(){
		System.out.println("Bread constructer invoked");
	}
	
	public void fechAllObj(){
		System.out.println("Bread brand name" + brandName);
		System.out.println("Bread number of slices" + noOfSlices);
		System.out.println("Bread type" + type);
		System.out.println("-----------------------------------");
	}
}