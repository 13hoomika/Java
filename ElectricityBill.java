class ElectricityBill{
	 String rrNo;
	 long accountId;
	 String address;
	
	ElectricityBill(){
		System.out.println("ElectricityBill constructer invoked");
	}
	
	public void findAllObj(){
		System.out.println("ElectricityBill rrNo" + rrNo);
		System.out.println("ElectricityBill accountId" + accountId);
		System.out.println("ElectricityBill address" + address);
		System.out.println("-----------------------------------");
	}
	
}