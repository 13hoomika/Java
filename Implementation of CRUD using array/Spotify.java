class Spotify{
	static String artists[] = {null,null,null,null,null,null,null,null};
	static String newArtists[] = {null,null,null,null,null,null,null};
	static int index;
	
	public static boolean giveArtists(String artistNames){
		
		boolean isAdded = false;
		if(artistNames != null){
			artists[index++] = artistNames;
			isAdded = true;
		}else{
			System.out.println("Name is Null/Empty");
		}
		
	return isAdded;
	}
	
	public static void getArtists(){
		System.out.println("List of Artists");
		for( String artistNames : artists){
			System.out.println("Added Artists Name: " + artistNames);
		}
	}
	
	public static boolean updateArtists(String newArtists, String oldArtists){
		boolean isUpdated = false;
		for(int begin =0; begin<artists.length; begin++){
			if(newArtists != null && oldArtists != null){
				if(artists[begin] == oldArtists){
					artists[begin] = newArtists;
					isUpdated = true;
					break;
				}
			}
		}
		if(isUpdated == false) System.out.println(oldArtists + " not found");
	return isUpdated;
	}
	public static boolean deleteByName(String delName){
		System.out.println("Delete operation method started");
		boolean isDeleted = false;
		
		for(int index=0,newIndex =0;  index < artists.length ; index++){
			
			if(artists[index] != delName){
				newArtists[newIndex++] = artists[index];
				
			}else{
				isDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isDeleted;
	}
	
	
	public static void getNewArr(){
		for( String newArrEle : newArtists){
			System.out.println(newArrEle);
		}
	}
}