class TheatreRunner{
	public static void main(String movies[]){
		boolean isListCreated = Theatre.CreateMovieList("Toby");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Ranga");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Jules");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("7:11 PM");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Sector 36");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Munjya");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Savi");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Auron Mein Kahan Dum Tha");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Maharaja");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Bheema");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Chandu Champion");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("artiicle 370");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Khalki");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Pechi");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		isListCreated = Theatre.CreateMovieList("Dhoomam");
		System.out.println("Movie name added to list - "+ isListCreated);
		
		Theatre.getMoviesList();
		
		boolean update = Theatre.updateMovieName("Dhoomam","Uppi 2");
		System.out.println("Updated Movie name - "+ update);
		
		Theatre.getMoviesList();
		
		boolean delete = Theatre.deleteByName("Uppi 2");
		System.out.println("Deleted "+ delete);
		
		Theatre.getNewArr();
	}
}