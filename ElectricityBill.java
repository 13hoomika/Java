class ElectricityBill{
	 String rrNo;
	 long accountId;
	 String address;
	
	ElectricityBill(){
		System.out.println("ElectricityBill constructer invoked..");
	}
	
	ElectricityBill(String rno,long aId,String add){
		rrNo = rno;
		accountId = aId;
		address = add;
	}
	
	public void findAllObj(){
		System.out.println("ElectricityBill rrNo: " + rrNo);
		System.out.println("ElectricityBill accountId: " + accountId);
		System.out.println("ElectricityBill address: " + address);
		System.out.println("-----------------------------------");
	}
	
}