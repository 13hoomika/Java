class shoppingMall{
	static String shops[] = {null,null,null,null,null,
							  null,null,null,null,null};
	static String newShops[] = {null,null,null,null,null,
							  null,null,null,null};
							  
	static int index;
	
	public static boolean CreateShops(String shopsName){
		boolean isListCreated = false;
		
		if(shopsName != null){
			shops[index++] = shopsName;
			return isListCreated = true;
		}else{
			System.out.println("Name is empty");
		}
		
	return isListCreated;
	}
	
	public static void getShops(){
		System.out.println("List of Shops Name");
		for(String shopsName : shops){
			System.out.println("Shop Name: " + shopsName);
		}
	}
	
	public static boolean updatShop(String oldNames, String newName){
		boolean isUpdated = false;
		for(int begin = 0; begin<shops.length; begin++){
			if(shops[begin] == oldNames){
				shops[begin] = newName;
				isUpdated = true;
				break;
			}
		}
		if(isUpdated == false) System.out.println(oldNames+" Not Found");
	return isUpdated;
	}
	
	public static boolean deleteByName(String delName){
		System.out.println("Delete operation method started");
		boolean isDeleted = false;
		
		for(int index=0,newIndex =0;  index < shops.length ; index++){
			
			if(shops[index] != delName){
				newShops[newIndex++] = shops[index];
				
			}else{
				isDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isDeleted;
	}
	
	
	public static void getNewArr(){
		for( String newArrEle : newShops){
			System.out.println(newArrEle);
		}
	}
}