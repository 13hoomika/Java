class ElectricityBill{
	 String rrNo;
	 int accountId;
	 String address;
	
	public ElectricityBill(){
		this(1234,"rajajinagar");
		System.out.println("0 args");
	}
	
	public ElectricityBill(int accountId,String address){
		this("RR009");
		this.accountId = accountId;
		this.address = address;
		System.out.println("2 args");
	}
	public ElectricityBill(String rrNo){
		this.rrNo = rrNo;
		System.out.println("1 arg");
	}
	
	public void findAllObj(){
		System.out.println("ElectricityBill rrNo: " + rrNo);
		System.out.println("ElectricityBill accountId: " + accountId);
		System.out.println("ElectricityBill address: " + address);
		System.out.println("-----------------------------------");
	}
	
}