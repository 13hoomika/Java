import java.util.Arrays;
class BlinkIt{
	static String catagories[] = {null,null,null,null,null,null,null,null};
	// static String newCatagories[] = {null,null,null,null,null,null,null};
	static int index;
//Create
	public static boolean createCat(String catName){
		boolean isListCreated = false;
		if(catName != null){
			catagories[index++] = catName;
			return isListCreated = true;
		}else{
			System.out.println("catagory name is empty");
		}
	return isListCreated;
	}

//Read	
	public static void fetchCat(){
		System.out.println("List of catagories");
		for(String catName : catagories){
			System.out.println("Category name: " + catName);
		}
	}

//Update
	public static boolean updateCat(String existingCat, String newCat){
		System.out.println("Update started");
		boolean isUpdated = false;
		
		for(int index=0; index<catagories.length; index++){
			if(catagories[index] == existingCat){
				catagories[index] = newCat;
				isUpdated = true;
				break;
			}
		}
		if(isUpdated == false) System.out.println(existingCat + " is not found");
	
		System.out.println("Update ended");
	return isUpdated;
	}
	
	// public static boolean deleteCat(String category){
		// System.out.println("Delete operation method started");
		// boolean isCatDeleted = false;
		
		// for(int index=0,newIndex =0;  index < catagories.length ; index++){
			
			// if(catagories[index] != category){
				// newCatagories[newIndex++] = catagories[index];
				
			// }else{
				// isCatDeleted =true;
			// }
		// }
			
		// System.out.println("Delete operation method Ended");
		// return isCatDeleted;
	// }
	
//delete	
	public static boolean deleteCat(String category){
		System.out.println("Delete operation method started");
		boolean isCatDeleted = false;
		int index,newIndex;
		for(index=0,newIndex =0;  index < catagories.length ; index++){
			
			if(catagories[index] != category){
				catagories[newIndex++] = catagories[index];
				
			}else{
				isCatDeleted =true;
			}
		}
		int size= newIndex;
		catagories = Arrays.copyOf(catagories,size);
		System.out.println("Delete operation method Ended");
		return isCatDeleted;
	}
	
	
	public static void getNewCat(){
		for( String newArrEle : catagories){
			System.out.println(newArrEle);
		}
	}
}