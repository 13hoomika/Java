class YouTubeRunner{
	public static void main(String yt[]){
		boolean isAdded = YouTube.createThumbnails("Your Brain Needs Rest");
		System.out.println("thumbnail added to list - "+ isAdded);
		
		isAdded = YouTube.createThumbnails("The Power of personal Branding");
		System.out.println("thumbnail added to list - "+ isAdded);
		
		isAdded = YouTube.createThumbnails("Things you need to know before play Chess");
		System.out.println("thumbnail added to list - "+ isAdded);
		
		isAdded = YouTube.createThumbnails("5 Steps to checkmate");
		System.out.println("thumbnail added to list - "+ isAdded);
			
		isAdded = YouTube.createThumbnails("I'm 40.If You're In Your 20's Watch This");
		System.out.println("thumbnail added to list - "+ isAdded);
		
		YouTube.getThumbnails();
		
		boolean isUpdated = YouTube.UpdateThumbnailByName("Your Brain Needs Rest","How to be present Minded");
		System.out.println("Name Updated " +isUpdated);
		
		YouTube.getThumbnails();
		
		boolean delete = YouTube.deleteByName("How to be present Minded");
		System.out.println("Deleted "+ delete);
		
		YouTube.getNewArr();
	}
}