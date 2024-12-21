class Bread{
	String brandName;
	int noOfSlices;
	String type;
	//"Britannia",15,"White bread"
	Bread(){
		this("Britannia");
		System.out.println("Bread default constructer invoked");
	}
	Bread(String brandName){
		this(15,"White bread");
		this.brandName = brandName;
	}
	Bread(int noOfSlices,String type){
		this.noOfSlices = noOfSlices;
		this.type = type;
	}
	
	public void fechAllObj(){
		System.out.println("Bread brand name: " + brandName);
		System.out.println("Bread number of slices: " + noOfSlices);
		System.out.println("Bread type: " + type);
		System.out.println("-----------------------------------");
	}
}