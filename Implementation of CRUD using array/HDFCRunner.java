class HDFCRunner{
	public static void main(String types[]){
		boolean isListCreated = HDFC.saveAccTypes("Fixed deposit account");
		System.out.println("Account Type name added to list - "+ isListCreated);
		
		isListCreated = HDFC.saveAccTypes("Family saving account");
		System.out.println("Account Type added to list - "+ isListCreated);
		
		isListCreated = HDFC.saveAccTypes("Recuuring deposit account");
		System.out.println("Account Type added to list - "+ isListCreated);
		
		isListCreated = HDFC.saveAccTypes("Children Saving account");
		System.out.println("Account Type added to list - "+ isListCreated);
		
		isListCreated = HDFC.saveAccTypes("Salary account");
		System.out.println("Account Type added to list - "+ isListCreated);
		
		HDFC.fetchAccTypes();
		
		boolean update = HDFC.updateAccName("Children Saving account","RD Acc");
		System.out.println("Updated Account name "+ update);
		
		HDFC.fetchAccTypes();
		
		boolean del = HDFC.deleteByName("Family saving account");
		System.out.println("Deleted "+ del);
		
		HDFC.getNewArr();
	}
}