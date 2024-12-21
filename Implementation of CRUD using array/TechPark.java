class TechPark{
	static String companies[] = {null,null,null,null,null,
							  null,null,null,null,null,
							  null,null,null,null,null};
							  
	static String newCompanies[] = {null,null,null,null,null,
							  null,null,null,null,null,
							  null,null,null,null};
	static int index;
	
	public static boolean createCom(String companyNames){
		
		boolean isAdded = false;
		if(companyNames != null){
			companies[index++] = companyNames;
			isAdded = true;
		}else{
			System.out.println("Name is Null/Empty");
		}
		
	return isAdded;
	}
	
	public static void fetchComp(){
		System.out.println("List of Insurence");
		for( String companyNames : companies){
			System.out.println("Added Company is: " + companyNames);
		}
	}
	
	public static boolean updateCompName(String oldCompName, String newCompName){
		boolean isUpdated = false;
		
		for(int start=0;start<companies.length;start++){
			if(companies[start] == oldCompName){
				companies[start] = newCompName;
				isUpdated = true;
				break;
			}
		}
		if(isUpdated == false) System.out.println(oldCompName+" Not Found");
		
	return isUpdated;
	}
	
	public static boolean deleteByName(String delName){
		System.out.println("Delete operation method started");
		boolean isDeleted = false;
		
		for(int index=0,newIndex =0;  index < companies.length ; index++){
			
			if(companies[index] != delName){
				newCompanies[newIndex++] = companies[index];
				
			}else{
				isDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isDeleted;
	}
	
	
	public static void getNewArr(){
		for( String newArrEle : newCompanies){
			System.out.println(newArrEle);
		}
	}
}