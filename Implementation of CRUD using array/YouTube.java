class YouTube{
	static String videos[] = {null,null,null,null,null};
	static String newVideos[] = {null,null,null,null};
	static int arrindex;
	
	public static boolean createThumbnails(String thumbnail){
		
		boolean isAdded = false;
		if(thumbnail != null){
			videos[arrindex++] = thumbnail;
			isAdded = true;
		}else{
			System.out.println("videos Name are Null/Empty");
		}
		
	return isAdded;
	}
	
	public static void getThumbnails(){
		System.out.println("List of videos");
		for( String thumbnail : videos){
			System.out.println("fetched thumbnail: " + thumbnail);
		}
	}
	
	public static boolean UpdateThumbnailByName(String oldName, String newName){
		boolean isUpdated = false;
		
		for(int start = 0; start < videos.length; start++){
			if(videos[start] == oldName){
				videos[start] = newName;
			isUpdated = true;
			break;
			}
			
		}
		if(isUpdated == false) System.out.println(oldName + " Not found");
		
		return isUpdated;
	}
	
	public static boolean deleteByName(String delName){
		System.out.println("Delete operation method started");
		boolean isDeleted = false;
		
		for(int index=0,newIndex =0;  index < videos.length ; index++){
			
			if(videos[index] != delName){
				newVideos[newIndex++] = videos[index];
				
			}else{
				isDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isDeleted;
	}
	
	
	public static void getNewArr(){
		for( String newArrEle : newVideos){
			System.out.println(newArrEle);
		}
	}
}