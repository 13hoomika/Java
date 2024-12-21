class HDFC{
	static String accountsArr[] = {null,null,null,null,null};
	static String newAccountsArr[] = {null,null,null,null};
	static int index;
	public static boolean saveAccTypes(String account){
		boolean isListCreated = false;
		
		if(account != null){
			accountsArr[index++] = account;
			return isListCreated = true;
		}else{
			System.out.println("Name is empty");
		}
		
	return isListCreated;
	}
	
	public static void fetchAccTypes(){
		System.out.println("List of Account Types");
		for(String account : accountsArr){
			System.out.println("Account Types name: " + account);
		}
	}
	
	public static boolean updateAccName(String existingAccName, String updatedAccName){
		boolean isUpdated = false;
		for(int begin=0; begin<accountsArr.length; begin++){
			if(accountsArr[begin] == existingAccName){
				accountsArr[begin] = updatedAccName;
				isUpdated = true;
				break;
			}
		}
		if(isUpdated == false) System.out.println(existingAccName+ " Not Found");
		
	return isUpdated;
	}
	
	public static boolean deleteByName(String delName){
		System.out.println("Delete operation method started");
		boolean isDeleted = false;
		
		for(int index=0,newIndex =0;  index < accountsArr.length ; index++){
			
			if(accountsArr[index] != delName){
				newAccountsArr[newIndex++] = accountsArr[index];
				
			}else{
				isDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isDeleted;
	}
	
	
	public static void getNewArr(){
		for( String newArrEle : newAccountsArr){
			System.out.println(newArrEle);
		}
	}
	
}