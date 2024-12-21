class Theatre{
	static String moviesList[] = {null,null,null,null,null,
							  null,null,null,null,null,
							  null,null,null,null,null};
	
	static String newMoviesList[] = {null,null,null,null,null,
									  null,null,null,null,null,
									  null,null,null,null};
	static int index;
	
	public static boolean CreateMovieList(String movieName){
		boolean isListCreated = false;
		
		if(movieName != null){
			moviesList[index++] = movieName;
			return isListCreated = true;
		}else{
			System.out.println("Movie name is empty");
		}
		
	return isListCreated;
	}
	
	public static void getMoviesList(){
		System.out.println("List of Movies Name");
		for(String movieName : moviesList){
			System.out.println("Movie name: " + movieName);
		}
	}
	
	public static boolean updateMovieName(String oldMovie, String newMovie){
		boolean isUpdate = false;
		
		for(int start = 0; start<moviesList.length; start++){
			if(moviesList[start] == oldMovie){
				moviesList[start] = newMovie;
				isUpdate = true;
				break;
			}
		}
		if(isUpdate == false) System.out.println(oldMovie+ " Not found");
		
	return isUpdate;
	}
	
	public static boolean deleteByName(String delName){
		System.out.println("Delete operation method started");
		boolean isDeleted = false;
		
		for(int index=0,newIndex =0;  index < moviesList.length ; index++){
			
			if(moviesList[index] != delName){
				newMoviesList[newIndex++] = moviesList[index];
				
			}else{
				isDeleted =true;
			}
		}
			
		System.out.println("Delete operation method Ended");
		return isDeleted;
	}
	
	
	public static void getNewArr(){
		for( String newArrEle : newMoviesList){
			System.out.println(newArrEle);
		}
	}
	
}