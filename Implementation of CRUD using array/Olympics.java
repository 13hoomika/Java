class Olympics{
	static String sportsList[] = {null,null,null,null,null,
							  null,null,null,null,null,
							  null,null,null,null,null};
							  
	static String newSportsList[] = {null,null,null,null,
							  null,null,null,null,null,
							  null,null,null,null,null};						  
	static int index;
	
	public static boolean setSports(String sportNames){
		
		boolean isAdded = false;
		if(sportNames != null){
			sportsList[index++] = sportNames;
			isAdded = true;
		}else{
			System.out.println("Name are Null/Empty");
		}
		
	return isAdded;
	}
	
	public static void getSports(){
		System.out.println("List of Sports");
		for( String sportNames : sportsList){
			System.out.println("Added Sport Name: " + sportNames);
		}
	}
	
	public static boolean updatesportsList(String existingName, String updatedName){
		boolean isUpdated = false;
		for(int begin=0; begin<sportsList.length; begin++){
			if(sportsList[begin] == existingName){
				sportsList[begin] = updatedName;
				isUpdated = true;
				break;
			}
		}
		if(isUpdated == false) System.out.println(existingName+ " Not Found");
		
	return isUpdated;
	}
	
	public static boolean deleteByName(String delName){
		System.out.println("Delete operation method started");
		boolean isDeleted = false;
		
		for(int index=0,newIndex =0;  index < sportsList.length ; index++){
			
			if(sportsList[index] != delName){
				newSportsList[newIndex++] = sportsList[index];
				
			}else{
				isDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isDeleted;
	}
	
	
	public static void getNewArr(){
		for( String newArrEle : newSportsList){
			System.out.println(newArrEle);
		}
	}
}