class PhonePe{
	static String insurencesArr[] = {null,null,null,null,null};
	static String newInsurencesArr[] = {null,null,null,null};
	static int index;
	
	public static boolean createInsurence(String insurence){
		
		boolean isInsurenceAdded = false;
		if(insurence != null){
			insurencesArr[index++] = insurence;
			isInsurenceAdded = true;
		}else{
			System.out.println("Insurence are Null/Empty");
		}
		
	return isInsurenceAdded;
	}
	
	public static void getInsurence(){
		System.out.println("List of Insurence");
		for( String insurence : insurencesArr){
			System.out.println("Added Insurence is: " + insurence);
		}
	}
	
	public static boolean updatedInsurence(String existingInsurence, String newInsurence){
		boolean isUpdated = false;
		for(int begin=0; begin<insurencesArr.length; begin++){
			if(insurencesArr[begin] == existingInsurence){
				insurencesArr[begin] = newInsurence;
				isUpdated = true;
				break;
			}
		}
		if(isUpdated == false) System.out.println(existingInsurence+ " Not Found");
		
	return isUpdated;
	}
	
	public static boolean deleteInsurenceByName(String insurenceName){
		System.out.println("Delete operation method started");
		boolean isInsurenceNameDeleted = false;
		
		for(int index=0,newIndex =0;  index < insurencesArr.length ; index++){
			
			if(insurencesArr[index] != insurenceName){
				newInsurencesArr[newIndex++] = insurencesArr[index];
				
			}else{
				isInsurenceNameDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isInsurenceNameDeleted;
	}
	
	
	public static void getNewInsurences(){
		for( String newArrEle : newInsurencesArr){
			System.out.println(newArrEle);
		}
	}
}